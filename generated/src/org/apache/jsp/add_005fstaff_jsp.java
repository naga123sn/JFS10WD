package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class add_005fstaff_jsp extends org.apache.jasper.runtime.HttpJspBase
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
ResultSet rs =null;
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
      out.write("<title>Add Tollgate</title>\n");
      out.write("</head>\n");
      out.write(" <script>\n");
      out.write("function back_funct(){\n");
      out.write("   \n");
      out.write("   ");
 String name3 = (String) request.getParameter("name");
   System.out.println("jsname:"+name3);
      out.write("\n");
      out.write("           var name = 'admin';\n");
      out.write("//window.open(\"Register.jsp\");\n");
      out.write("window.open(\"http://localhost:8080/bus/admin.jsp?name=\"+name);\n");
      out.write("//var name = \"roseindia\";\n");
      out.write("//window.location.replace(\"a.jsp?name=\"+name);\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("           .first{\n");
      out.write("    background-color:black;\n");
      out.write("    color:white;\n");
      out.write("}\n");
      out.write("body .dashboards{\n");
      out.write("    background-size:cover;\n");
      out.write("     background-repeat:no-repeat;\n");
      out.write("     background-attachment:fixed;\n");
      out.write("     margin:0px;\n");
      out.write("     padding:0px;\n");
      out.write("}\n");
      out.write(".fleft{\n");
      out.write("    float:left !important;\n");
      out.write("    margin-top:10px;\n");
      out.write("    margin-left:10px;\n");
      out.write("}\n");
      out.write(".fright{\n");
      out.write("    float:right !important;\n");
      out.write("    text-align:right;\n");
      out.write("    margin: 10px 30px;\n");
      out.write("    display:inline-block; \n");
      out.write("    border-radius: 2px;\n");
      out.write("   font-weight: bold;\n");
      out.write("   text-transform: uppercase;\n");
      out.write("     outline:0px;\n");
      out.write("        border:none;\n");
      out.write("     \n");
      out.write("}\n");
      out.write("f-item{\n");
      out.write("    display:block;\n");
      out.write("    border:none;\n");
      out.write("    outline:0px;\n");
      out.write("}\n");
      out.write(".topnav-name{\n");
      out.write("    position:relative;\n");
      out.write("}\n");
      out.write(".centered {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("  color:black;\n");
      out.write("  text-transform: uppercase;\n");
      out.write(" font-size:22px;\n");
      out.write(" color:black;\n");
      out.write("}\n");
      out.write(" button{\n");
      out.write("    border:none;\n");
      out.write("    color:white;\n");
      out.write("    padding:10px 30px;\n");
      out.write("    text-align:left;\n");
      out.write("    text-decoration:none;\n");
      out.write("    display:inline-block;\n");
      out.write("    font-size:16px;\n");
      out.write("    margin:4px 2px;\n");
      out.write("    cursor:pointer;\n");
      out.write("    background-color:black;\n");
      out.write("    border-radius:10px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("p{\n");
      out.write("    font-size: small;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("          \n");
      out.write("    <div class=\"first\" style=\"width:100%;height:45px;\">\n");
      out.write("      <h2 class=\"fleft topnav-name\" title=\"name\" style=\"padding-right:10px !important;passing-left:10px !important;\">ONLINE BUS TICKET BOOKING SYSTEM</h2>\n");
      out.write("        <a class=\"fright f-item topnav-icons\" href=\"http://localhost:8080/bus/admin.jsp\" target=\"_blank\" title=\"login\" style=\"padding-right:10px !important; padding-left:10px !important; color:white;\"> Logout </a>\n");
      out.write("    \n");
      out.write("                 </div>\n");
      out.write("<center>\n");
      out.write("   \n");
      out.write("   <div class=\"container\" style=\"width:100%;height:80%;position:absolute\">\n");
      out.write("   \n");
      out.write(" <script type=\"text/javascript\" src=\"js/fileselection.js\"></script>\n");
      out.write("\n");
      out.write("  <form name=\"add_staff\" class=\"registartion-form\" action=\"add_staff\" method=\"post\">\n");
      out.write("      <table> \n");
      out.write("         <h1 style='color:black;'>Add Staff</h1>\n");
      out.write("         ");
 String name2 = (String) request.getParameter("name"); 
      out.write("\n");
      out.write("      <tr>\n");
      out.write("        <td><label for=\"hospital\">Staff Name:</label></td>\n");
      out.write("        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"staffname\" id=\"staffname\" placeholder=\"John\" required=\"required\"></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td><label for=\"hospital\">Gender</label></td>\n");
      out.write("        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"gender\" id=\"staffname\" placeholder=\"Male/Female\" required=\"required\"></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td><label for=\"hospital\">Phone</label></td>\n");
      out.write("        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"phone\" id=\"staffname\" placeholder=\"70954 45674\" required=\"required\"></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td><label for=\"hospital\">Address</label></td>\n");
      out.write("        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"address\" id=\"staffname\" placeholder=\"Address\" required=\"required\"></td>\n");
      out.write("      </tr>\n");
      out.write("     <tr>\n");
      out.write("        <td><label for=\"hospital\">Qualification</label></td>\n");
      out.write("        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"qualification\" id=\"staffname\" placeholder=\"Ex: Bsc\" required=\"required\"></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td><label for=\"username\">User Name:</label></td>\n");
      out.write("        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"username\" id=\"username\" placeholder=\"Ex: john\" required=\"required\"></td>\n");
      out.write("      </tr>\n");
      out.write("     \n");
      out.write("      <tr>\n");
      out.write("        <td><label for=\"email\">Email id:</label></td>\n");
      out.write("        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"email\" id=\"email\" placeholder=\"john@gmail.com\" required=\"required\"></td> \n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("          <td><label for=\"password\">Password: </label></td>\n");
      out.write("        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"password\" id=\"password\" placeholder=\"*****\" required=\"required\"></td> \n");
      out.write("      </tr>\n");
      out.write("     \n");
      out.write("  \n");
      out.write("      \n");
      out.write("      <tr>\n");
      out.write("        <td colspan=\"2\"><input type=\"submit\" class=\"submit\" value=\"Add Staff\" /></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("          <button id=\"back\" onclick=\"back_funct()\">Back</button>\n");
      out.write("      </tr>\n");
      out.write("           \n");
      out.write("    </table>\n");
      out.write("  </form>\n");
      out.write("   </div>\n");
      out.write("      </center>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("       <script>\n");
      out.write("         function msgfunction(){ </script>\n");
      out.write("  ");

      
   String sAction = (String) request.getAttribute("alertMsg"); 
      out.write(" \n");
      out.write("    ");
 if(sAction=="In Progress, Not yet decide"){ 
      out.write("\n");
      out.write("    <script>\n");
      out.write("        alert(\"In Progress, Not yet decide\");\n");
      out.write("        \n");
      out.write("        </script>");
 } 
     String aSuccess=  (String) request.getAttribute("alertMsg"); 
      out.write(" \n");
      out.write("    ");
 if(aSuccess=="Staff Details Added Successfully"){ 
      out.write("\n");
      out.write("    <script>\n");
      out.write("        alert(\"Staff Details Added Successfully\");\n");
      out.write("        \n");
      out.write("        </script>");
 } 
      out.write("\n");
      out.write("<script> }</script>\n");
      out.write(" \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
