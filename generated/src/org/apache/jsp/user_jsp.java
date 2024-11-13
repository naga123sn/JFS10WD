package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <div class=\"first\" style=\"width:100%;height:45px;\">\n");
      out.write("\n");
      out.write("        <div class=\"dropdown fright\">\n");
      out.write("            <button class=\"dropbtn\" onclick=\"location.href = 'http://localhost:8080/bus/index.jsp';\">Logout</button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"dropdown fright\">\n");
      out.write("            <button class=\"dropbtn\" onclick=\"location.href = 'http://localhost:8080/bus/user_payment.jsp';\" >Payment</button>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         <div class=\"dropdown fright\">\n");
      out.write("                          <button class=\"dropbtn\" onclick=\"location.href='http://localhost:8080/bus/userbooking.jsp';\" >Bookings</button>\n");
      out.write("                       </div>\n");
      out.write("         <div class=\"dropdown fright\">\n");
      out.write("                          <button class=\"dropbtn\" onclick=\"location.href='http://localhost:8080/bus/user_bus_list.jsp';\" >Bus List</button>\n");
      out.write("                       </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("           <img src= \"img/bg.jpg\">\n");
      out.write("        \n");
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
