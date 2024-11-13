package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    \n");
      out.write("<style>\n");
      out.write("        .first{\n");
      out.write("    background-color:#6F4E37;\n");
      out.write("    color:white;\n");
      out.write("}\n");
      out.write("body .dashboards{\n");
      out.write("     background-size:cover;\n");
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
      out.write("    margin: 5px 30px;\n");
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
      out.write("  top: 60%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("  color:black;\n");
      out.write("  text-transform: uppercase;\n");
      out.write(" font-size:22px;\n");
      out.write("}\n");
      out.write(" button{\n");
      out.write("    border:none;\n");
      out.write("    color:white;\n");
      out.write("    padding:10px 30px;\n");
      out.write("    text-align:center;\n");
      out.write("    text-decoration:none;\n");
      out.write("    display:inline-block;\n");
      out.write("    font-size:16px;\n");
      out.write("    margin:4px 2px;\n");
      out.write("    cursor:pointer;\n");
      out.write("    background-color:black;\n");
      out.write("    border-radius:10px;\n");
      out.write("}\n");
      out.write(" ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #333;\n");
      out.write("  width:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover:not(.active) {\n");
      out.write("  background-color: #111;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active {\n");
      out.write("  background-color: #04AA6D;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("   </head>\n");
      out.write("  \n");
      out.write("   \n");
      out.write("        <body  >\n");
      out.write("            \n");
      out.write("                  \n");
      out.write("            <ul>\n");
      out.write("            <li><a href=\"\">ONLINE BUS TICKET BOOKING SYSTEM</a></li>\n");
      out.write("          \n");
      out.write(" \n");
      out.write("  <li style=\"float:right\"><a href=\"user_login.jsp\">User</a></li>\n");
      out.write("  <li style=\"float:right\"><a href=\"staff_login1.jsp\">Staff</a></li>\n");
      out.write("   \n");
      out.write("  <li style=\"float:right\"><a href=\"admin_login.jsp\">Admin</a></li>\n");
      out.write("  <li style=\"float:right\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("  \n");
      out.write("</ul>\n");
      out.write("           \n");
      out.write("        <img src=\"img/bg2.jpg\" alt=\"Girl in a jacket\" width=\"100%\" height=\"840\">      \n");
      out.write("           \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
