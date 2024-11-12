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
@WebServlet(urlPatterns = {"/add_bus"})
public class add_bus extends HttpServlet {

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
}
    catch(Exception e){
        e.printStackTrace();
        System.out.println(e);
}
        
        String busno = request.getParameter("no");
        System.out.println(busno);
        String busname = request.getParameter("busname");
         System.out.println(busname);
        String model = request.getParameter("model");
         System.out.println(model);
        String reg = request.getParameter("reg");
         System.out.println(reg);
        String type= request.getParameter("type");
         System.out.println(type);
        
                  
                    
                
                 if(busno.isEmpty()   || reg.isEmpty() || type.isEmpty() || model.isEmpty()|| busname.isEmpty())
                 {
                     System.out.println("Error");
                           RequestDispatcher req = request.getRequestDispatcher("add_bus.jsp");
                           req.include(request, response);

                 }
                 else
                 {
            String sql = "INSERT INTO bus (no,busname,model,reg,type) "
                    + "values ('"+busno+"','"+busname+"','"+model+"','"+reg+"','"+type+"')";
                       System.out.println(sql);
                       stmt.executeUpdate(sql);
                           
                           request.setAttribute("alertMsg", "Staff Details Added Successfully");
                            //request.setAttribute("name", name);
                           RequestDispatcher req = request.getRequestDispatcher("add_bus.jsp");
                           req.forward(request, response);
                          
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
            Logger.getLogger(add_staff.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(add_staff.class.getName()).log(Level.SEVERE, null, ex);
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
