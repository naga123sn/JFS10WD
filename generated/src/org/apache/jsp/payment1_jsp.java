package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class payment1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 ResultSet rs1;
    String r = null;
    String s = null;
    String x = null, y = null, z = null, p = null, o = null, u = null, v = null, t1 = null, t2 = null, t3 = null;
    String busno = null, source = null, destination = null, date = null, price = null, Rp = null, Bseat = null;
    int available_seat=0,booked_seat=0;
    int realpayment;

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
      out.write("    </head>\n");
      out.write("   <script>\n");
      out.write("function call(){\n");
      out.write("    \n");
      out.write("    alert(\"Ticket Booked Successfully!\");\n");
      out.write("  \n");
      out.write(" \n");
      out.write("}\n");
      out.write("</script>\n");
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
      out.write("        <div class=\"first\" style=\"width:100%;height:45px;\">\n");
      out.write("\n");
      out.write("            <div class=\"dropdown fright\">\n");
      out.write("                <button class=\"dropbtn\" onclick=\"location.href = 'http://localhost:8080/bus/index.jsp';\">Logout</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("            <div class=\"dropdown fright\">\n");
      out.write("                <button class=\"dropbtn\" onclick=\"location.href = 'http://localhost:8080/bus/userbooking.jsp';\" >Bookings</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"dropdown fright\">\n");
      out.write("                <button class=\"dropbtn\" onclick=\"location.href = 'http://localhost:8080/bus/user_bus_list.jsp';\" >Bus List</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <div class=\"container\" style=\"width:100%;height:100%;position:absolute\">\n");
      out.write("\n");
      out.write("            <script type=\"text/javascript\" src=\"js/fileselection.js\"></script>\n");
      out.write("\n");
      out.write("            <form name=\"buy_plan\" class=\"registartion-form\"  method=\"post\">\n");
      out.write("                <table> \n");
      out.write("                    <h1 style='color:black;'>Payment</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");

                        int iid = Integer.parseInt(request.getParameter("id"));

                        String name = (String) session.getAttribute("p");

                        System.out.println(iid);
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("Driver Start");
                        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking", "root", "");
                        System.out.println("Getconnection Start");
                        Statement stmt2 = con1.createStatement();
                        Statement stmt3 = con1.createStatement();
                        System.out.println(iid);
                        String query = "select * from add_bus where id='" + iid + "'";
                        rs1 = stmt2.executeQuery(query);

                        while (rs1.next()) {

                            busno = rs1.getString(5);

                            date = rs1.getString(7);
available_seat=rs1.getInt(9);
booked_seat=rs1.getInt(10);
                            source = rs1.getString(12);
                            price = rs1.getString(11);
                            destination = rs1.getString(13);

                    
      out.write(" \n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"hidden\"  name=\"from\" id=\"from\" value=\"");
      out.print(busno);
      out.write("\" ></td> \n");
      out.write("\n");
      out.write("\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"hidden\" name=\"did\" id=\"to\" value=\"");
      out.print(date);
      out.write("\" >\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"hidden\" name=\"dn\" id=\"to\" value=\"");
      out.print(source);
      out.write("\" ></td> \n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"hidden\" name=\"g\" id=\"to\" value=\"");
      out.print(destination);
      out.write("\" ></td> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }

                        u = session.getAttribute("p").toString();
                        v = session.getAttribute("l").toString();

                    
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"amount\">Enter No of Seats </label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"bseat\" id=\"amount\" value=\"\" placeholder=\"Ex: 1 or 2\" required=\"required\"></td> \n");
      out.write("                     </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"amount\">Amount in Rs.: </label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"amount\" id=\"amount\" value=\" \" placeholder=\"Ex: 500\" required=\"required\"></td> \n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"Bank Name\">Bank Name: </label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"bank\" id=\"bank\" placeholder=\"Ex: SBI\" required=\"required\"></td> \n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"Account No\">Account No: </label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"account\" id=\"account\" placeholder=\"Ex: 123456845126523\" required=\"required\"></td> \n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"Card No\">Card No: </label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"card\" id=\"card\" placeholder=\"Ex: 256\" required=\"required\"></td> \n");
      out.write("                    </tr> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                    <button id=\"back\" onclick=\" ");

              try {
                  String account = null, amount = null, card = null, sp = null, di = null, un = null, dn = null, bank = null, ui = null, time = null;
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bus_booking", "root", "");
                  Statement stmt = con.createStatement();
                  Statement stmt1 = con.createStatement();
                  amount = request.getParameter("amount");
                  if (amount != null) {
                      System.out.println("iiiiii" + amount);
//                  String sqll="select * from doctor_l
                      bank = request.getParameter("bank");
                      System.out.println(amount);

                      System.out.println(amount);
                      account = request.getParameter("account");
                      System.out.println(amount);
                      card = request.getParameter("card");
                      System.out.println(card);
                      un = session.getAttribute("p").toString();
                      System.out.println(un);
                      ui = session.getAttribute("l").toString();
                      System.out.println(ui);
                      String up = session.getAttribute("ph").toString();
                      System.out.println(up);
                      String sql = "INSERT INTO booking(username,userid,phone,bus_number,date,source,destination,seats,amount)values ('" + un + "','" + ui + "','" + up + "','" + busno + "','" + date + "','" + source + "','" + destination + "','" + Bseat + "','" + amount + "')";
                      System.out.println(sql);
                      stmt.executeUpdate(sql);
                      
                      
                      String sql2 = "INSERT INTO payment(username,user_id,amount,bank,account,card,booking_status,payment_status)values ('" + un + "','" + ui + "','" + amount + "','" + bank + "','" + account + "','" + card + "','" + "Booked" + "','" + "Paid" + "')";
                      System.out.println(sql2);
                      stmt.executeUpdate(sql2);
                      

                      int modify_seat=Integer.parseInt(Bseat);
                      
                      int after_booking=available_seat - modify_seat;
                      int Booked=booked_seat+modify_seat;
                       String sql3 = "Update add_bus set available_seat='"+after_booking+"', booked_seat='"+Booked+"' where id='" + iid + "'";
System.out.println("Frst:"+sql3);
                       stmt.executeUpdate(sql3);
                      
                  }
              }
                  catch(Exception e)
                          {
                          System.out.println(e);
                          }
                      

      out.write("call()\"> Pay </button></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("</body>\n");
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
