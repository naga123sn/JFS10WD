package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registration Form</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .first{\n");
      out.write("            background-color:#6F4E37;\n");
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
      out.write("            margin-top:10px;\n");
      out.write("            margin-left:10px;\n");
      out.write("        }\n");
      out.write("        .fright{\n");
      out.write("            float:right !important;\n");
      out.write("            text-align:right;\n");
      out.write("            margin: 10px 30px;\n");
      out.write("            display:inline-block; \n");
      out.write("            border-radius: 2px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("            outline:0px;\n");
      out.write("            border:none;\n");
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
      out.write("        .centered {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 50%;\n");
      out.write("            left: 50%;\n");
      out.write("            transform: translate(-50%, -50%);\n");
      out.write("            color:black;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("            font-size:22px;\n");
      out.write("            color:black;\n");
      out.write("        }\n");
      out.write("        button{\n");
      out.write("            border:none;\n");
      out.write("            color:white;\n");
      out.write("            padding:10px 30px;\n");
      out.write("            text-align:center;\n");
      out.write("            text-decoration:none;\n");
      out.write("            display:inline-block;\n");
      out.write("            font-size:16px;\n");
      out.write("            margin:4px 2px;\n");
      out.write("            cursor:pointer;\n");
      out.write("            background-color:black;\n");
      out.write("            border-radius:10px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"\">ONLINE BUS TICKET BOOKING SYSTEM</a></li>\n");
      out.write("\n");
      out.write("            <li style=\"float:right\"><a href=\"userregister.jsp\">Register</a></li>\n");
      out.write("            <li style=\"float:right\"><a href=\"user_login.jsp\">Login</a></li>\n");
      out.write("            <li style=\"float:right\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"container\" style=\"width:100%;height:80%;position:absolute\">\n");
      out.write("\n");
      out.write("            <script type=\"text/javascript\" src=\"js/fileselection.js\"></script>\n");
      out.write("\n");
      out.write("            <form name=\"registration\" class=\"registartion-form\" action=\"user_register\" method=\"post\">\n");
      out.write("                <table> \n");
      out.write("                    <h1 style='color:black;'>Register Form</h1>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"name\">Name:</label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"name\" id=\"name\" placeholder=\"your name\" required=\"required\"></td>\n");
      out.write("                    </tr> <tr>\n");
      out.write("                        <td><label for=\"name\">Phone :</label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"phone\" id=\"name\" placeholder=\"your phone number\" required=\"required\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"gender\">Username</label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"username\" placeholder=\"your username\"  required=\"required\">\n");
      out.write("\n");
      out.write("                    </tr> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label for=\"password\">Password:</label></td>\n");
      out.write("                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"password\" name=\"password\" id=\"password\" placeholder=\"your Password\" required=\"required\">\n");
      out.write("                            <i class=\"far fa-eye\" id=\"togglePassword\" style=\"margin-left: -30px; cursor: pointer;\"></i></td>\n");
      out.write("                    <script>\n");
      out.write("                        const togglePassword = document.querySelector('#togglePassword');\n");
      out.write("                        const password = document.querySelector('#password');\n");
      out.write("\n");
      out.write("                        togglePassword.addEventListener('click', function (e) {\n");
      out.write("                            // toggle the type attribute\n");
      out.write("                            const type = password.getAttribute('type') === 'password' ? 'text' : 'password';\n");
      out.write("                            password.setAttribute('type', type);\n");
      out.write("                            // toggle the eye slash icon\n");
      out.write("                            this.classList.toggle('fa-eye-slash');\n");
      out.write("                        });\n");
      out.write("                    </script>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\"><input type=\"submit\" class=\"submit\" value=\"Register\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <script>\n");
      out.write("                    function msgfunction() {</script>\n");
      out.write("                    ");


                        String sAction = (String) request.getAttribute("alertMsg"); 
      out.write(" \n");
      out.write("                    ");
 if (sAction == "In Progress, Not yet decide") { 
      out.write("\n");
      out.write("                <script>\n");
      out.write("                        alert(\"In Progress, Not yet decide\");\n");
      out.write("\n");
      out.write("                </script>");
 }
                    String aSuccess = (String) request.getAttribute("alertMsg"); 
      out.write(" \n");
      out.write("                ");
 if (aSuccess == "Registered Successfully") { 
      out.write("\n");
      out.write("                <script>\n");
      out.write("                        alert(\"Registered Successfully\");\n");
      out.write("\n");
      out.write("                </script>");
 }
      out.write("\n");
      out.write("                <script> }</script>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("  \n");
      out.write("    <br>\n");
      out.write("  \n");
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
