package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class user_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n");
      out.write("<title>Login Form</title>\r\n");
      out.write("</head>\r\n");
      out.write("  <script>function msgfunction(){alert(\"Login successfully\");}</script>\r\n");
      out.write("  \r\n");
      out.write("<body>\r\n");
      out.write("   \r\n");
      out.write("          \r\n");
      out.write("                             <ul>\r\n");
      out.write("            <li><a href=\"\">ONLINE BUS TICKET BOOKING SYSTEM</a></li>\r\n");
      out.write("          \r\n");
      out.write("  <li style=\"float:right\"><a href=\"userregister.jsp\">Register</a></li>\r\n");
      out.write("  <li style=\"float:right\"><a href=\"user_login.jsp\">Login</a></li>\r\n");
      out.write("  <li style=\"float:right\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("  \r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("   <div class=\"container\" style=\"width:100%;height:80%;\">\r\n");
      out.write("\r\n");
      out.write("  <form name=\"Login Form\" class=\"login-form\"  method=\"post\">\r\n");
      out.write("         \r\n");
      out.write("      <table> \r\n");
      out.write("         <h1 style='color:black;'>Login Form</h1>\r\n");
      out.write("         <br>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td><label for=\"username\">User Name:</label></td>\r\n");
      out.write("        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type=\"text\" name=\"username\" placeholder=\"your Username\" required=\"required\"></td>\r\n");
      out.write("        \r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td><label for=\"password\">Password:</label></td>\r\n");
      out.write("        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type=\"text\" name=\"password\" placeholder=\"your Password\" required=\"required\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    \r\n");
      out.write("         \r\n");
      out.write("           \r\n");
      out.write("      <tr>\r\n");
      out.write("        <td colspan=\"2\"><input type=\"submit\" class=\"submit\" value=\"Submit\" onclick=\"  ");

          Connection con;
          Statement stmt=null,stmt1;
          String username1;
          String U=null,p,L=null,P=null;
          
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
                 
                 String sql="select username,password,id,phone from user_register where username='"+username1+"'and password='"+password1+"'" ;
                 System.out.println(sql);
                ResultSet rs=stmt.executeQuery(sql);
            
                  if (rs.next()) {
                      System.out.println("Start");
                      
                      request.setAttribute("success", "Logged In Successfully");
                      U=rs.getString(1);
                      L=rs.getString(3);
                      P=rs.getString(4);
               
      out.write("\r\n");
      out.write("             \r\n");
      out.write("               ");

                      System.out.println("After success Set Attributes");
                     response.sendRedirect("user.jsp"); 

                    } else {
                      System.out.println("Start1");
                     
                      System.out.println("After Set Attributes");
                     
                             }
        session.setAttribute("p",U);
          session.setAttribute("l",L);
session.setAttribute("ph",P);
          
          
      out.write("\r\n");
      out.write("\"/></td>\r\n");
      out.write("      \r\n");
      out.write("      </tr>\r\n");
      out.write("           \r\n");
      out.write("    </table>\r\n");
      out.write("      </form>\r\n");
      out.write("     \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    </center>            \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("     ");
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
