package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class schedule_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n");
      out.write("        <title>Login Form</title>\r\n");
      out.write("        ");
 String name;
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <style>\r\n");
      out.write("        .first{\r\n");
      out.write("            background-color:black;\r\n");
      out.write("            color:white;\r\n");
      out.write("        }\r\n");
      out.write("        body .dashboards{\r\n");
      out.write("            background-size:cover;\r\n");
      out.write("            background-repeat:no-repeat;\r\n");
      out.write("            background-attachment:fixed;\r\n");
      out.write("            margin:0px;\r\n");
      out.write("            padding:0px;\r\n");
      out.write("        }\r\n");
      out.write("        .fleft{\r\n");
      out.write("            float:left !important;\r\n");
      out.write("            margin-top:6px;\r\n");
      out.write("            margin-left: 20px;\r\n");
      out.write("            padding-right:50px;\r\n");
      out.write("        }\r\n");
      out.write("        .fright{\r\n");
      out.write("            float:right !important;\r\n");
      out.write("            text-align:left;\r\n");
      out.write("            margin: 0px 20px;\r\n");
      out.write("            display:inline-block; \r\n");
      out.write("            border-radius: 2px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            text-transform: uppercase;\r\n");
      out.write("            outline:0px;\r\n");
      out.write("            border:none;\r\n");
      out.write("            margin-top:6px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        f-item{\r\n");
      out.write("            display:block;\r\n");
      out.write("            border:none;\r\n");
      out.write("            outline:0px;\r\n");
      out.write("        }\r\n");
      out.write("        .topnav-name{\r\n");
      out.write("            position:relative;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");

            String Y = (String) session.getAttribute("y");
            System.out.println(Y);

            /*   if(name2.isEmpty()){
        name2 = request.getParameter("name");
      }*/

        
      out.write("\r\n");
      out.write("        <div class=\"first\" style=\"width:100%;height:45px;\">\r\n");
      out.write("            <h2 class=\"topnav-name fleft\" title=\"name\" >ONLINE BUS TICKET BOOKING SYSTEM</h2>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"dropdown fright\">\r\n");
      out.write("                <button class=\"dropbtn\" onclick=\"location.href = 'http://localhost:8080/bus/index.jsp';\">Logout</button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"dropdown fright\"> \r\n");
      out.write("                <button class=\"dropbtn\" onclick=\"location.href = '#';\">Bus</button>\r\n");
      out.write("                <div class=\"dropdown-content\">\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"bus_list.jsp\">Add Schedule</a>\r\n");
      out.write("                    <a href=\"schedule_list.jsp\">View Bus </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"dropdown fright\">\r\n");
      out.write("                <button class=\"dropbtn\" onclick=\"location.href = 'http://localhost:8080/bus/payment_staff.jsp';\" >Bill</button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container1\" style=\"width:100%;height:100%;position:absolute\">\r\n");
      out.write("\r\n");
      out.write("            <table border=\"1\" style=\"height:50px;width: 1000px;\">\r\n");
      out.write("                <br>\r\n");
      out.write("                <h1 style='color:black;'>Schedule</h1>\r\n");
      out.write("                <br>\r\n");
      out.write("                <tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <th> ID</th>\r\n");
      out.write("\r\n");
      out.write("                    <th>Bus number</th>\r\n");
      out.write("\r\n");
      out.write("                    <th>Date</th>\r\n");
      out.write("                    <th>Total Seat</th>\r\n");
      out.write("                    <th>Available Seat</th>\r\n");
      out.write("                    <th>Booked Seat</th>\r\n");
      out.write("                    <th>Price</th>\r\n");
      out.write("                    <th>Source</th>\r\n");
      out.write("                    <th>Destination</th>\r\n");
      out.write("                    <th>Arrival Time</th>\r\n");
      out.write("                    <th>Departure Time</th>\r\n");
      out.write(" <th>Delete</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                ");
   Connection con;
                    Statement stmt;
                    Statement stmt1;
                    try {
                        Class.forName("com.mysql.jdbc.Driver");

                        System.out.println("Driver Start");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking", "root", "");
                        System.out.println("Getconnection Start");
                        stmt = con.createStatement();
                        stmt1 = con.createStatement();
                        String sql = "select * from add_bus";
                        System.out.println(sql);
                        ResultSet rs = stmt.executeQuery(sql);
                                while (rs.next()) {
                                    int id = rs.getInt(1);
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("\r\n");
      out.write("                    <td style=\"height: 50px;width:70px;\"> ");
 out.println(rs.getString(1)); 
      out.write(" </td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <td>");
 out.println(rs.getString(5)); 
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("                    <td>");
  out.println(rs.getString(7)); 
      out.write("</td>\r\n");
      out.write("                    <td>");
  out.println(rs.getString(8)); 
      out.write("</td>\r\n");
      out.write("                    <td>");
 out.println(rs.getString(9)); 
      out.write("</td>\r\n");
      out.write("                    <td>");
 out.println(rs.getString(10)); 
      out.write("</td>\r\n");
      out.write("                    <td>");
 out.println(rs.getString(11)); 
      out.write("</td>  <td>");
 out.println(rs.getString(12)); 
      out.write("</td>\r\n");
      out.write("                    <td>");
 out.println(rs.getString(13)); 
      out.write("</td>\r\n");
      out.write("                    <td>");
 out.println(rs.getString(14)); 
      out.write("</td>\r\n");
      out.write("                    <td>");
 out.println(rs.getString(15));
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <td>     <a href=\"deleteschedule.jsp?id=");
      out.print(id);
      out.write("\"><u>Delete</u></a></td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");


                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <img src= \"img/bg.jpg\">\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
