package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class add_005fbus_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("        <title>Login Form</title>\n");
      out.write("        ");
 String name;
            Connection con;
            Statement stmt = null, stmt1 = null;
            String doctorid = null, doctorname = null, genderr = null, specialist = null;
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <script>   function back_funct() {\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("        .first{\n");
      out.write("            background-color:black;\n");
      out.write("            color:white;\n");
      out.write("        }\n");
      out.write("        body .dashboards{\n");
      out.write("            background-size:cover;\n");
      out.write("            background-repeat:no-repeat;\n");
      out.write("            background-attachment:fixed;\n");
      out.write("            margin:0px;\n");
      out.write("            padding:0px;\n");
      out.write("        }\n");
      out.write("        .fleft{\n");
      out.write("            float:left !important;\n");
      out.write("            margin-top:6px;\n");
      out.write("            margin-left: 20px;\n");
      out.write("            padding-right:50px;\n");
      out.write("        }\n");
      out.write("        .fright{\n");
      out.write("            float:right !important;\n");
      out.write("            text-align:left;\n");
      out.write("            margin: 0px 20px;\n");
      out.write("            display:inline-block; \n");
      out.write("            border-radius: 2px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("            outline:0px;\n");
      out.write("            border:none;\n");
      out.write("            margin-top:6px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        f-item{\n");
      out.write("            display:block;\n");
      out.write("            border:none;\n");
      out.write("            outline:0px;\n");
      out.write("        }\n");
      out.write("        .topnav-name{\n");
      out.write("            position:relative;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");


            String Y = (String) session.getAttribute("y");
            System.out.println(Y);

            /*   if(name2.isEmpty()){
        name2 = request.getParameter("name");
      }*/
        
      out.write("\n");
      out.write("        <div class=\"first\" style=\"width:100%;height:45px;\">\n");
      out.write("            <h2 class=\"topnav-name fleft\" title=\"name\" >ONLINE BUS TICKET BOOKING SYSTEM</h2>\n");
      out.write("      \n");
      out.write("                     <div class=\"dropdown fright\">\n");
      out.write("                           <button class=\"dropbtn\" onclick=\"location.href='http://localhost:8080/bus/index.jsp';\">Logout</button>\n");
      out.write("                          </div>\n");
      out.write("                           \n");
      out.write("                          \n");
      out.write("                        <div class=\"dropdown fright\"> \n");
      out.write("                                  <button class=\"dropbtn\" onclick=\"location.href='#';\">Bus</button>\n");
      out.write("                                  <div class=\"dropdown-content\">\n");
      out.write("                           \n");
      out.write("                          <a href=\"bus_list.jsp\">Add Schedule</a>\n");
      out.write("                          <a href=\"schedule_list.jsp\">View Bus </a>\n");
      out.write("                        </div>\n");
      out.write("                          </div>\n");
      out.write("                     \n");
      out.write("                       <div class=\"dropdown fright\">\n");
      out.write("                          <button class=\"dropbtn\" onclick=\"location.href='http://localhost:8080/bus/payment_staff.jsp';\" >Bill</button>\n");
      out.write("                       </div>\n");
      out.write("                         \n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container1\" style=\"width:100%;height:80%;position:absolute\">\n");
      out.write("            <form name=\"add_staff\" class=\"registartion-form\"  method=\"post\">\n");
      out.write("\n");
      out.write("                <table>\n");
      out.write("                    <br>\n");
      out.write("                    <h1 style='color:black;'><center>Bus</center></h1>\n");
      out.write("                   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"amount\">Driver Name </label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"driver\" id=\"amount\"  required=\"required\"></td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"amount\">Mobile </label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"phone\" id=\"amount\"   required=\"required\"></td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"amount\">Date </label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"date\" id=\"amount\"   required=\"required\"></td> \n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("  <tr>\n");
      out.write("                        <td><label for=\"amount\">Total Seat </label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"oseat\" id=\"amount\"  required=\"required\"></td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"amount\">Available Seat </label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"aseat\" id=\"amount\"   required=\"required\"></td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"amount\">Booked Seat </label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"bseat\" id=\"amount\"   required=\"required\"></td> \n");
      out.write("                    </tr>\n");
      out.write("  <tr>\n");
      out.write("                        <td><label for=\"amount\">Price</label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"price\" id=\"amount\" placeholder=\"\" required=\"required\"></td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"amount\">Source </label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"source\" id=\"amount\"   required=\"required\"></td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"amount\">Destination </label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"destination\" id=\"amount\"   required=\"required\"></td> \n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td><label for=\"amount\">Arrival Time </label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"atime\" id=\"amount\" placeholder=\"\" required=\"required\"></td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"amount\">Departure Time </label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"dtime\" id=\"amount\"   required=\"required\"></td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                     <center>    <td>    \n");
      out.write("                    <button id=\"back\" onclick=\"");
 int id = 0;
                        String username1;
                        String h = null;
                        String busname=null,busno=null,type=null;
                        try {
                            String idd = request.getParameter("id").toString();
                            Class.forName("com.mysql.jdbc.Driver");

                            System.out.println("Driver Start");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking", "root", "");
                            System.out.println("Getconnection Start");
                            stmt = con.createStatement();
                            stmt1 = con.createStatement();
                            String sqll = "select * from bus where id='" + idd + "'";
                            System.out.println(sqll);
                            ResultSet rs = stmt.executeQuery(sqll);
                            while (rs.next()) {
                                id = rs.getInt(1);
                                busno=rs.getString(2);
                                busname=rs.getString(3);
                                type=rs.getString(6);
                            }

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                            System.out.println("Driver Start");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus", "root", "");
                            System.out.println("Getconnection Start");
                            stmt = con.createStatement();
                            stmt1 = con.createStatement();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }


                        String driver = request.getParameter("driver");
                        System.out.println(driver);
                        String phone = request.getParameter("phone");
                        System.out.println(phone);
                       String date = request.getParameter("date");
                        System.out.println(phone);
                         String oseat = request.getParameter("oseat");
                        System.out.println(phone);
                        String aseat = request.getParameter("aseat");
                        System.out.println(phone);
                        String bseat = request.getParameter("bseat");
                        System.out.println(phone); 
                        String price = request.getParameter("price");
                        System.out.println(phone);
                         String source = request.getParameter("source");
                        System.out.println(phone);
                        String destination = request.getParameter("destination");
                        System.out.println(phone);
                        String atime = request.getParameter("atime");
                        System.out.println(phone); 
                        String dtime = request.getParameter("dtime");
                        System.out.println(phone);
                        
                        
                        if (driver != null) {
                           
                                    String sql = "INSERT INTO add_bus (driver_name,phone,bus_name,bus_number,bus_type,date,original_seat,available_seat,booked_seat,price,source,destination,atime,dtime) "
                                            + "values ('" + driver + "','" + phone + "','" + busname + "','" + busno + "','" + type + "','" +date + "','" + oseat + "','" + aseat + "','" + bseat + "','" + price + "','" + source + "','" + destination + "','" + atime + "','" + dtime+ "')";
                                    System.out.println(sql);
                                    stmt.executeUpdate(sql);

                                    if (true) {
                                        System.out.println("Start");

//                      response.sendRedirect("staffdoctor_list1.jsp");
                                    }
                                }
                            
                        
                        /*else if(rs1.next()){
                      System.out.println("Start");
                      
                      request.setAttribute("success", "Logged In Successfully");
                      request.setAttribute("name", rs1.getString(1));
               
                      System.out.println("After success Set Attributes");
                      RequestDispatcher rd=request.getRequestDispatcher("Staff.jsp");
                      rd.forward(request,response);
                  }*/



      out.write("\">Submit</button></td></center>\n");
      out.write("                    </tr>\n");
      out.write("                </table></form>\n");
      out.write("        </div>\n");
      out.write("               \n");
      out.write("    </body>\n");
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
