<%-- 
    Document   : Register
    Created on : Oct 21, 2022, 12:29:53 PM
    Author     : CMP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Login Form</title>
</head>
<body>
     
                             <ul>
            <li><a href="">ONLINE BUS TICKET BOOKING SYSTEM</a></li>
   
  <li style="float:right"><a onclick="location.href='staff_login1.jsp';">Login</a></li>
  <li style="float:right"><a onclick="location.href='index.jsp';">Home</a></li>
  
</ul>
    <center>
   <div class="container" style="width:100%;height:80%; background-image:img/bg.jpg;" >

  <form name="Login Form" class="login-form"  method="post">
         
      <table> 
         <h1 style='color:black;'>Login Form</h1>
         <br>
      <tr>
        <td><label for="username">User Name:</label></td>
        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="username" placeholder="your Username" required="required"></td>
        
      </tr>
      <tr>
        <td><label for="password">Password:</label></td>
        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="password" placeholder="your Password" required="required"></td>
        
      </tr>
      
     
              
         
           
      <tr>
        <td colspan="2"><input type="submit" name="submit" onclick="  <% Statement stmt=null;
    Statement stmt1;
    ResultSet rs;
  String username1;
  String h=null;
                try{
                     Connection con;
   
              Class.forName("com.mysql.cj.jdbc.Driver");
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
                     
                      response.sendRedirect("staff1.jsp");
               session.setAttribute("y",h);
                      System.out.println("After success Set Attributes");
                    
session.setAttribute("Yes","Yes");
                    } 
                
                  else {
                      System.out.println("Start1");
                      
                      System.out.println("After Set Attributes");
                     
                        
                             }                   
                
                %>" class="submit" value="submit"/></td>
      
      </tr>
           
    </table>
       </form>
     
</div>

    </center>         
</body>

</html>

            