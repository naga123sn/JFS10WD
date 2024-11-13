package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class staff_005flogin1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("<title>Login Form</title>\n");
      out.write("</head>\n");
      out.write("<script>function call()\n");
      out.write("    {\n");
      out.write("        alert(\"Login Successfully!\");\n");
      out.write("    }</script>\n");
      out.write("<body>\n");
      out.write("     \n");
      out.write("                             <ul>\n");
      out.write("            <li><a href=\"\">ONLINE BUS TICKET BOOKING SYSTEM</a></li>\n");
      out.write("   \n");
      out.write("  <li style=\"float:right\"><a href=\"staff_login1.jsp\">Login</a></li>\n");
      out.write("  <li style=\"float:right\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("  \n");
      out.write("</ul>\n");
      out.write("    <center>\n");
      out.write("   <div class=\"container\" style=\"width:100%;height:80%; background-image:img/bg.jpg;\" >\n");
      out.write("\n");
      out.write("  <form name=\"Login Form\" class=\"login-form\"  method=\"post\">\n");
      out.write("         \n");
      out.write("      <table> \n");
      out.write("         <h1 style='color:black;'>Login Form</h1>\n");
      out.write("         <br>\n");
      out.write("      <tr>\n");
      out.write("        <td><label for=\"username\">User Name:</label></td>\n");
      out.write("        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type=\"text\" name=\"username\" placeholder=\"your Username\" required=\"required\"></td>\n");
      out.write("        \n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td><label for=\"password\">Password:</label></td>\n");
      out.write("        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type=\"text\" name=\"password\" placeholder=\"your Password\" required=\"required\"></td>\n");
      out.write("        \n");
      out.write("      </tr>\n");
      out.write("      \n");
      out.write("     \n");
      out.write("              \n");
      out.write("         \n");
      out.write("           \n");
      out.write("      <tr>\n");
      out.write("        <td colspan=\"2\"><input type=\"submit\" name=\"submit\" onclick=\"  ");
 Statement stmt=null;
    Statement stmt1;
    ResultSet rs;
  String username1;
  String h=null;
                try{
                     Connection con;
   
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
                 
                // String sql="select user_name,password from admin where user_name='"+username1+"'and password='"+password1+"'" ;
                 String sql="select username,password from staff_details where username='"+username1+"'and password='"+password1+"'" ;
                 System.out.println(sql);
             rs=stmt.executeQuery(sql);
                 
            
                  if (rs.next()) {
                      System.out.println("Start");
                     h=rs.getString(1);
        
      out.write("call()");

                      response.sendRedirect("staff1.jsp");
               session.setAttribute("y",h);
                      System.out.println("After success Set Attributes");
                    

                    } 
                
                  else {
                      System.out.println("Start1");
                      
                      System.out.println("After Set Attributes");
                     
                        
                             }                   
                
                
      out.write("\" class=\"submit\" value=\"submit\"/></td>\n");
      out.write("      \n");
      out.write("      </tr>\n");
      out.write("           \n");
      out.write("    </table>\n");
      out.write("       </form>\n");
      out.write("     \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    </center>         \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            ");
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
