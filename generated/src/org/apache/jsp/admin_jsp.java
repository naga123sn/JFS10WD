package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" function bill(){\r\n");
      out.write(" \r\n");
      out.write("//window.open(\"Register.jsp\");\r\n");
      out.write("window.open(\"http://localhost:8080/bus/billadmin.jsp\");\r\n");
      out.write("\r\n");
      out.write("//var name = \"roseindia\";\r\n");
      out.write("//window.location.replace(\"a.jsp?name=\"+name);\r\n");
      out.write("}\r\n");
      out.write("function bus(){\r\n");
      out.write(" \r\n");
      out.write("//window.open(\"Register.jsp\");\r\n");
      out.write("window.open(\"http://localhost:8080/bus/busdetail.jsp?name=\"+name);\r\n");
      out.write("\r\n");
      out.write("//var name = \"roseindia\";\r\n");
      out.write("//window.location.replace(\"a.jsp?name=\"+name);\r\n");
      out.write("}\r\n");
      out.write("function user(){\r\n");
      out.write(" \r\n");
      out.write("//window.open(\"Register.jsp\");\r\n");
      out.write("window.open(\"http://localhost:8080/bus/userdetail.jsp\");\r\n");
      out.write("\r\n");
      out.write("//var name = \"roseindia\";\r\n");
      out.write("//window.location.replace(\"a.jsp?name=\"+name);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write(".first{\r\n");
      out.write("    background-color:black;\r\n");
      out.write("    color:white;\r\n");
      out.write("}\r\n");
      out.write("body .dashboards{\r\n");
      out.write("    background-size:cover;\r\n");
      out.write("     background-repeat:no-repeat;\r\n");
      out.write("     background-attachment:fixed;\r\n");
      out.write("     margin:0px;\r\n");
      out.write("     padding:0px;\r\n");
      out.write("}\r\n");
      out.write(".fleft{\r\n");
      out.write("    float:left !important;\r\n");
      out.write("    margin-top:6px;\r\n");
      out.write("    margin-left: 20px;\r\n");
      out.write("    padding-right:50px;\r\n");
      out.write("}\r\n");
      out.write(".fright{\r\n");
      out.write("    float:right !important;\r\n");
      out.write("   text-align:left;\r\n");
      out.write("    margin: 0px 20px;\r\n");
      out.write("    display:inline-block; \r\n");
      out.write("    border-radius: 2px;\r\n");
      out.write("   font-weight: bold;\r\n");
      out.write("   text-transform: uppercase;\r\n");
      out.write("     outline:0px;\r\n");
      out.write("     border:none;\r\n");
      out.write("      margin-top:6px;\r\n");
      out.write("     \r\n");
      out.write("}\r\n");
      out.write("f-item{\r\n");
      out.write("    display:block;\r\n");
      out.write("    border:none;\r\n");
      out.write("    outline:0px;\r\n");
      out.write("}\r\n");
      out.write(".topnav-name{\r\n");
      out.write("    position:relative;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("     ");

    String name2 = (String) request.getAttribute("name");
     System.out.println("attribute"+name2);
     if(name2==null){
      name2 = request.getParameter("name");
    }


     
      out.write("\r\n");
      out.write("     \r\n");
      out.write("                 <div class=\"first\" style=\"width:100%;height:45px;\">\r\n");
      out.write("                   \r\n");
      out.write("      \r\n");
      out.write("                     <div class=\"dropdown fright\">\r\n");
      out.write("                           <button class=\"dropbtn\" onclick=\"location.href='index.jsp';\">Logout</button>\r\n");
      out.write("                          </div>\r\n");
      out.write("                     \r\n");
      out.write("                    \r\n");
      out.write("                     <div class=\"dropdown fright\">\r\n");
      out.write("                           <button class=\"dropbtn\" onclick=\"bill()\">Payments</button>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      \r\n");
      out.write("                        <div class=\"dropdown fright\">\r\n");
      out.write("                          <button class=\"dropbtn\" onclick=\"user()\">User</button>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      <div class=\"dropdown  fright\">\r\n");
      out.write("                          <button class=\"dropbtn\">Bus</button>\r\n");
      out.write("                        <div class=\"dropdown-content\">\r\n");
      out.write("                           \r\n");
      out.write("                          <a href=\"add_bus.jsp\">Add Bus</a>\r\n");
      out.write("                          <a href=\"editbus_list.jsp\">Delete Bus </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"dropdown  fright\">\r\n");
      out.write("                          <button class=\"dropbtn\">Staff</button>\r\n");
      out.write("                        <div class=\"dropdown-content\">\r\n");
      out.write("                           \r\n");
      out.write("                          <a href=\"add_staff.jsp\">Add Staff</a>\r\n");
      out.write("                          <a href=\"editstaff_list.jsp\">Update/Delete Staff </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                          \r\n");
      out.write("                         \r\n");
      out.write("                          \r\n");
      out.write("                          \r\n");
      out.write("                 </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container1\" style=\"width:100%;height:100%;position:absolute\">\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("    <script>\r\n");
      out.write("         function msgfunction(){ </script>\r\n");
      out.write("  ");

      
   String sAction = (String) request.getAttribute("error"); 
      out.write(" \r\n");
      out.write("    ");
 if(sAction=="Invalid user or password"){ 
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        alert(\"Invalid Username Or Password\");\r\n");
      out.write("        \r\n");
      out.write("        </script>");
 } 
     String aSuccess=  (String) request.getAttribute("success");
String name = (String) request.getAttribute("name");
System.out.println("name:"+name);
        
      out.write(" \r\n");
      out.write("    ");
 if(aSuccess=="Logged In Successfully"){ 
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        alert(\"Logged In Successfully\");\r\n");
      out.write("        //window.open(\"candidate_portal.jsp\");\r\n");
      out.write("        </script>");
 }
if(aSuccess=="Profile Updated Successfully"){
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("        alert(\"Profile Updated Successfully\");\r\n");
      out.write("        //window.open(\"candidate_portal.jsp\");\r\n");
      out.write("        </script> ");
}
      out.write("\r\n");
      out.write("<script> }</script>\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("        \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
