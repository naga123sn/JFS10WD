<%-- 
    Document   : Register
    Created on : Oct 21, 2022, 12:29:53 PM
    Author     : CMP
--%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Connection con;
Statement stmt;
Statement stmt1;
String staffname;
String username; 
String email;
String password;
String gender;
String address;
String qualification;
String phone;
String mobile;
String noofstaff;
int tollgate_id;
int id;%>


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
<title>Edit Tollgate</title>
</head>
 <script>
function back_funct(){
   
   
//window.open("Register.jsp");
window.open("http://localhost:8080/bus/admin.jsp");
//var name = "roseindia";
//window.location.replace("a.jsp?name="+name);
}
</script>
<style>
           .first{
    background-color:black;
    color:white;
}
body .dashboards{
    background-size:cover;
     background-repeat:no-repeat;
     background-attachment:fixed;
     margin:0px;
     padding:0px;
}
.fleft{
    float:left !important;
    margin-top:10px;
    margin-left:10px;
}
.fright{
    float:right !important;
    text-align:right;
    margin: 10px 30px;
    display:inline-block; 
    border-radius: 2px;
   font-weight: bold;
   text-transform: uppercase;
     outline:0px;
        border:none;
     
}
f-item{
    display:block;
    border:none;
    outline:0px;
}
.topnav-name{
    position:relative;
}
.centered {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  color:black;
  text-transform: uppercase;
 font-size:22px;
 color:black;
}
 button{
    border:none;
    color:white;
    padding:10px 30px;
    text-align:center;
    text-decoration:none;
    display:inline-block;
    font-size:16px;
    margin:4px 2px;
    cursor:pointer;
    background-color:black;
    border-radius:10px;

}


</style>
<body>
    
                         

                      
          
    <div class="first" style="width:100%;height:45px;">
      <h2 class="fleft topnav-name" title="name" style="padding-right:10px !important;passing-left:10px !important;">ONLINE BUS TICKET BOOKING SYSTEM</h2>
        <a class="fright f-item topnav-icons" href="http://localhost:8080/bus/index.jsp" target="_blank" title="login" style="padding-right:10px !important; padding-left:10px !important; color:white;"> Logout </a>
    
                 </div>
<center>
   <div class="container" style="width:100%;height:80%;position:absolute">
   
 <script type="text/javascript" src="js/fileselection.js"></script>

  <form name="editstaff" class="registartion-form" action="editstaff" method="post">
      <table> 
         <h1 style='color:black;'>Edit Staff</h1>
          <%  try{
               String staff_id = request.getParameter("id");
                String name = request.getParameter("name");
              
                    Class.forName("com.mysql.cj.jdbc.Driver");
                       System.out.println("Driver Start");
                       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking", "root", "");
                      System.out.println("Getconnection Start");
                       stmt = con.createStatement();
                        stmt1 = con.createStatement();
                         String sql="select staffname,gender,phone,address,qualification,username,email,password,staff_id from staff_details where staff_id='"+staff_id+"' ";
                      // System.out.println(sql);
                       ResultSet rs=stmt.executeQuery(sql);
                        while (rs.next()) {%>
                        <tr>

                       
                        <% 
                           
                        staffname=rs.getString(1);
                        gender=rs.getString(2);
                        phone=rs.getString(3);
                         address=rs.getString(4);
                         qualification=rs.getString(5);
                         username=rs.getString(6);
                         email=rs.getString(7);
                      password=rs.getString(8);
                        staff_id=rs.getString(9);
                      
                        %>
         <tr>
        <td><label for="hospital">Staff Name:</label></td>
        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="staffname" value="<%=staffname%>" id="staffname" placeholder="John" required="required"></td>
      </tr>
      <tr>
        <td><label for="hospital">Gender</label></td>
        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="gender" id="staffname"value="<%=gender%>"placeholder="Male/Female" required="required"></td>
      </tr>
      <tr>
        <td><label for="hospital">Phone</label></td>
        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="phone"value="<%=phone%>" id="staffname" placeholder="70954 45674" required="required"></td>
      </tr>
      <tr>
        <td><label for="hospital">Address</label></td>
        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="address" value="<%=address%>"id="staffname" placeholder="Address" required="required"></td>
      </tr>
     <tr>
        <td><label for="hospital">Qualification</label></td>
        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="qualification"value="<%=qualification%>" id="staffname" placeholder="Ex: MBBS" required="required"></td>
      </tr>
      <tr>
        <td><label for="username">User Name:</label></td>
        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="username"value="<%=username%>" id="username" placeholder="Ex: john" required="required"></td>
      </tr>
     
      <tr>
        <td><label for="email">Email id:</label></td>
        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="email" value="<%=email%>"id="email" placeholder="john@gmail.com" required="required"></td> 
      </tr>
      <tr>
          <td><label for="password">Password: </label></td>
        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="password" id="password" placeholder="*****" required="required"></td> 
      </tr>
     
  
      
     
  
      <tr>
        <td colspan="2"><input type="submit" class="submit" value="Update Staff" /></td>
        <input type="hidden" name="staff_id" value="<%=staff_id %>" /></td>
      </tr>
      <tr>
          <button id="back" onclick="back_funct()">Back</button>
      </tr>
    <%  }
                        }
                            catch(Exception e){
                                e.printStackTrace();
                        }
                   
                    %>
           
    </table>
       <script>
         function msgfunction(){ </script>
  <%
      
   String sAction = (String) request.getAttribute("alertMsg"); %> 
    <% if(sAction=="In Progress, Not yet decide"){ %>
    <script>
        alert("In Progress, Not yet decide");
        
        </script><% } 
     String aSuccess=  (String) request.getAttribute("alertMsg"); %> 
    <% if(aSuccess=="Staff Details Updated Successfully"){ %>
    <script>
        alert("Staff Details Updated Successfully");
        
        </script><% } %>
<script> }</script>

  </form>
</div>
</center>

<br>
 <footer class="main-footer">
        <p>Developed by <a href="" target="_blank">  </a></p>
   
</body>

</html>


