/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
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

/**
 *
 * @author CMP
 */
@WebServlet(urlPatterns = {"/deletebus"})
public class deletebus extends HttpServlet {

    Connection con;
    Statement stmt;
    Statement stmt1;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        
        try{
              Class.forName("com.mysql.jdbc.Driver");
                 System.out.println("Driver Start");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking", "root", "");
                System.out.println("Getconnection Start");
             stmt = con.createStatement();
             stmt1 = con.createStatement();

        

                  int staff_id = parseInt(request.getParameter("id"));

           
                 if(staff_id==0)
                 {
                     System.out.println("Error");
                           RequestDispatcher req = request.getRequestDispatcher("editbus_list.jsp");
                           req.include(request, response);

                 }
                 else
                 {
                     System.out.println("before update:"+staff_id);
                     String sql = "delete from bus where id='"+staff_id+"'";
                        System.out.println("Frst:"+sql);
                       stmt.executeUpdate(sql);
                           System.out.println(sql);
                           request.setAttribute("alertMsg", "Staff Details Deleted Successfully");
                           RequestDispatcher req = request.getRequestDispatcher("editbus_list.jsp");
                           req.forward(request, response);
                          
                 }
                 }
    catch(Exception e){
        e.printStackTrace();
}
        }
        
       /* response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet job_register</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet job_register at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
    

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
