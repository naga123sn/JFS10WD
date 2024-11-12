

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author CMP
 */
@WebServlet(urlPatterns = {"/admin_login"})
public class admin_login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     private static final long serialVersionUID = 1L;
    Connection con;
    Statement stmt;
    Statement stmt1;
    ResultSet rs;
    public static String username1;
    protected String processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        
        try{
              Class.forName("com.mysql.jdbc.Driver");
                 System.out.println("Driver Start");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking", "root", "");
                System.out.println("Getconnection Start");
                stmt = con.createStatement();
                 stmt1 = con.createStatement();
}
    catch(Exception e){
        e.printStackTrace();
}
        System.out.println(request.getParameter("username"));
         username1 = request.getParameter("username");
                 String password1 = request.getParameter("password");
                 System.out.println("username:"+username1);
                 System.out.println("password:"+password1);
                 
                 String sql="select username,password from admin where username='"+username1+"'and password='"+password1+"'" ;
               //  String sql1="select username,password from staff_details where username='"+username1+"'and password='"+password1+"'" ;
                 System.out.println(sql);
                ResultSet rs=stmt.executeQuery(sql);
             
            
                  if (rs.next()) {
                      System.out.println("Start");
                      
                      request.setAttribute("success", "Logged In Successfully");
                      request.setAttribute("name", rs.getString(1));
               
                      System.out.println("After success Set Attributes");
                      RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
                      rd.forward(request,response);

                    } 
                  /*else if(rs1.next()){
                      System.out.println("Start");
                      
                      request.setAttribute("success", "Logged In Successfully");
                      request.setAttribute("name", rs1.getString(1));
               
                      System.out.println("After success Set Attributes");
                      RequestDispatcher rd=request.getRequestDispatcher("Staff.jsp");
                      rd.forward(request,response);
                  }*/
                  else {
                      System.out.println("Start1");
                      request.setAttribute("error", "Invalid user or password");
                      System.out.println("After Set Attributes");
                      RequestDispatcher rd=request.getRequestDispatcher("admin_login.jsp");
                      rd.forward(request,response);
                        
                             }
     
         return  rs.getString(1);
        
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
           System.out.println(ex);
           JOptionPane.showMessageDialog(null,ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            System.out.println(ex);
               JOptionPane.showMessageDialog(null,ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
