package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class editstaff_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 Connection con;
Statement stmt;
Statement stmt1;
String tollgatename;
String location; 
String address;
String country;
String mobile;
String noofstaff;
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
      out.write("<title>Edit Staff List</title>\n");
      out.write("</head>\n");
      out.write(" <script>\n");
      out.write("function back_funct(){\n");
      out.write("   \n");
 String name3 = (String) request.getParameter("name");
   System.out.println("jsname:"+name3);
      out.write("\n");
      out.write("           var name = '");
      out.print(name3);
      out.write("';\n");
      out.write("//window.open(\"Register.jsp\");\n");
      out.write("window.open(\"http://localhost:8080/bus/admin.jsp?name=\"+name);\n");
      out.write("//var name = \"roseindia\";\n");
      out.write("//window.location.replace(\"a.jsp?name=\"+name);\n");
      out.write("}\n");
      out.write("function editcoffee(){\n");
      out.write("   \n");
      out.write("   \n");
      out.write("//window.open(\"Register.jsp\");\n");
      out.write("coffee_id=document.getElementById('edit').value;\n");
      out.write("alert(coffee_id);\n");
      out.write("window.open(\"http://localhost:8080/bus/editstaff.jsp?id=\"+coffee_id);\n");
      out.write("//var name = \"roseindia\";\n");
      out.write("//window.location.replace(\"a.jsp?name=\"+name);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function deletecoffee(){\n");
      out.write("    coffee_id=document.getElementById('delete').value;\n");
      out.write("\n");
      out.write(" var doIt=confirm('Do you want to delete the record?');\n");
      out.write("  if(doIt){\n");
      out.write("    \n");
      out.write("   window.open(\"http://localhost:8080/bus/deletestaff?id=\"+coffee_id);\n");
      out.write("    }\n");
      out.write("  else{\n");
      out.write("\n");
      out.write("    }\n");
      out.write("   \n");
      out.write("//window.open(\"Register.jsp\");\n");
      out.write("//coffee_id=document.getElementById('delete').value;\n");
      out.write("//alert(coffee_id);\n");
      out.write("//window.open(\"http://localhost:8080/CoffeeShop/editcoffee.jsp?id=\"+coffee_id);\n");
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
      out.write("    text-align:center;\n");
      out.write("    text-decoration:none;\n");
      out.write("    display:inline-block;\n");
      out.write("    font-size:16px;\n");
      out.write("    margin:4px 2px;\n");
      out.write("    cursor:pointer;\n");
      out.write("    background-color:black;\n");
      out.write("    border-radius:10px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("#edit{\n");
      out.write("    \n");
      out.write("    border:none;\n");
      out.write("    color:white;\n");
      out.write("    padding:10px 30px;\n");
      out.write("    text-align:center;\n");
      out.write("    text-decoration:none;\n");
      out.write("    display:inline-block;\n");
      out.write("    font-size:16px;\n");
      out.write("    margin:4px 2px;\n");
      out.write("    cursor:pointer;\n");
      out.write("    background-color:green;\n");
      out.write("    border-radius:10px;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("#delete{\n");
      out.write("    \n");
      out.write("    border:none;\n");
      out.write("    color:white;\n");
      out.write("    padding:10px 30px;\n");
      out.write("    text-align:center;\n");
      out.write("    text-decoration:none;\n");
      out.write("    display:inline-block;\n");
      out.write("    font-size:16px;\n");
      out.write("    margin:4px 2px;\n");
      out.write("    cursor:pointer;\n");
      out.write("    background-color:red;\n");
      out.write("    border-radius:10px;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("     ");

    String name2 = (String) request.getAttribute("name");
     System.out.println("attribute"+name2);
     if(name2==null){
      name2 = request.getParameter("name");
    }

 /*   if(name2.isEmpty()){
      name2 = request.getParameter("name");
    }*/
   
     
      out.write("\n");
      out.write("          \n");
      out.write("    <div class=\"first\" style=\"width:100%;height:45px;\">\n");
      out.write("      <h2 class=\"fleft topnav-name\" title=\"name\" style=\"padding-right:10px !important;passing-left:10px !important;\">ONLINE BUS TICKET BOOKING SYSTEM</h2>\n");
      out.write("        <a class=\"fright f-item \" href=\"http://localhost:8080/bus/index.jsp\" target=\"_blank\" title=\"login\" style=\"padding-right:10px !important; padding-left:10px !important; color:white;\"> Logout </a>\n");
      out.write("    \n");
      out.write("                 </div>\n");
      out.write("   <div class=\"container1\" style=\"width:100%;height:100%;position:absolute;\">\n");
      out.write("                 \n");
      out.write("                   <table border=\"1\" style=\"height:50px;width: 1000px;\">\n");
      out.write("                       <br>\n");
      out.write("                        <h1 style='color:black;'>Staff List</h1>\n");
      out.write("                        <br>\n");
      out.write("                        <tr>\n");
      out.write("                           \n");
      out.write("                             <th style=\"height: auto;width:100px;\">Staff Name</th>\n");
      out.write("                               <th>Gender</th>\n");
      out.write("                               <th>Phone</th>\n");
      out.write("                                 <th>Address</th>\n");
      out.write("                                   <th>Qualification</th>\n");
      out.write("                                     \n");
      out.write("                                 <th>User Name</th>\n");
      out.write("                             <th>Email Id</th>\n");
      out.write("                             <th>Password</th>\n");
      out.write("                             \n");
      out.write("                             <th>Action</th>\n");
      out.write("    \n");
      out.write("                        </tr>\n");
      out.write("                      \n");
      out.write("                        ");
  try{
                    Class.forName("com.mysql.jdbc.Driver");
                
                    System.out.println("list:"+name2);
                       System.out.println("Driver Start");
                       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking", "root", "");
                      System.out.println("Getconnection Start");
                       stmt = con.createStatement();
                        stmt1 = con.createStatement();
                         String sql="select * from staff_details";
                       System.out.println(sql);
                       ResultSet rs=stmt.executeQuery(sql);
                        while (rs.next()) { int id=rs.getInt(1);
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                           \n");
      out.write("                     <td style=\"height: 50px;width:70px;\"> ");
 out.println(rs.getString(2)); 
      out.write(" </td>\n");
      out.write("                     <td>");
 out.println(rs.getString(3)); 
      out.write("</td>\n");
      out.write("                        <td>");
 out.println(rs.getString(4)); 
      out.write("</td>\n");
      out.write("                         <td>");
 out.println(rs.getString(5)); 
      out.write("</td>\n");
      out.write("                          <td>");
 out.println(rs.getString(6)); 
      out.write("</td>\n");
      out.write("                           <td>");
 out.println(rs.getString(7)); 
      out.write("</td>\n");
      out.write("                            <td>");
 out.println(rs.getString(8)); 
      out.write("</td> \n");
      out.write("                            <td>");
 out.println(rs.getString(9)); 
      out.write("</td>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                          \n");
      out.write("                      \n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                        <td><button id=\"edit\" value=\"");
  out.println(rs.getString(6)); 
      out.write("\" onclick=\"location.href='http://localhost:8080/bus/editstaff.jsp?name=");
      out.print(name2);
      out.write("&id=");
      out.print(id);
      out.write("';\">Edit</button>\n");
      out.write("                        <button id=\"delete\" value=\"");
  out.println(rs.getString(6)); 
      out.write("\" onclick=\"location.href='http://localhost:8080/bus/deletestaff?name=");
      out.print(name2);
      out.write("&id=");
      out.print(id);
      out.write("';\">Delete</button></td>\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                        </tr>\n");
      out.write("                        ");
  

                      }
                        }
                            catch(Exception e){
                                e.printStackTrace();
                        }
                   
                    
      out.write("\n");
      out.write("                 \n");
      out.write("       <tr>\n");
      out.write("          <button id=\"back\" onclick=\"back_funct()\">Back</button>\n");
      out.write("      </tr>\n");
      out.write("            </table>\n");
      out.write("   </div>\n");
      out.write("                    \n");
      out.write("\n");
      out.write(" <script type=\"text/javascript\" src=\"js/fileselection.js\"></script>\n");
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
        String name=  (String) request.getAttribute("name");
      out.write(" \n");
      out.write("    ");
 if(aSuccess=="Staff Details Updated Successfully"){ 
      out.write("\n");
      out.write("    <script>\n");
      out.write("        alert(\"Staff Details Updated Successfully\");\n");
      out.write("        \n");
      out.write("        </script>");
 }
 String aSuccess1=  (String) request.getAttribute("alertMsg"); 
      out.write(" \n");
      out.write("    ");
 if(aSuccess=="Staff Details Deleted Successfully"){ 
      out.write("\n");
      out.write("    <script>\n");
      out.write("        alert(\"Staff Details Deleted Successfully\");\n");
      out.write("        \n");
      out.write("        </script>");
 }
      out.write("\n");
      out.write("<script> }</script>\n");
      out.write("   <img src= \"img/bg.jpg\">\n");
      out.write("</body>\n");
      out.write("\n");
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
