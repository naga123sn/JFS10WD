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
<script>


 function bill(){
 
//window.open("Register.jsp");
window.open("http://localhost:8080/bus/billadmin.jsp");

//var name = "roseindia";
//window.location.replace("a.jsp?name="+name);
}
function bus(){
 
//window.open("Register.jsp");
window.open("http://localhost:8080/bus/busdetail.jsp?name="+name);

//var name = "roseindia";
//window.location.replace("a.jsp?name="+name);
}
function user(){
 
//window.open("Register.jsp");
window.open("http://localhost:8080/bus/userdetail.jsp");

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
    margin-top:6px;
    margin-left: 20px;
    padding-right:50px;
}
.fright{
    float:right !important;
   text-align:left;
    margin: 0px 20px;
    display:inline-block; 
    border-radius: 2px;
   font-weight: bold;
   text-transform: uppercase;
     outline:0px;
     border:none;
      margin-top:6px;
     
}
f-item{
    display:block;
    border:none;
    outline:0px;
}
.topnav-name{
    position:relative;
}
</style>

<body>
     <%
    String name2 = (String) request.getAttribute("name");
     System.out.println("attribute"+name2);
     if(name2==null){
      name2 = request.getParameter("name");
    }


     %>
     
                 <div class="first" style="width:100%;height:45px;">
                   
      
                     <div class="dropdown fright">
                           <button class="dropbtn" onclick="location.href='index.jsp';">Logout</button>
                          </div>
                     
                    
                     <div class="dropdown fright">
                           <button class="dropbtn" onclick="bill()">Payments</button>
                          </div>
                      
                        <div class="dropdown fright">
                          <button class="dropbtn" onclick="user()">User</button>
                          </div>
                      <div class="dropdown  fright">
                          <button class="dropbtn">Bus</button>
                        <div class="dropdown-content">
                           
                          <a href="add_bus.jsp">Add Bus</a>
                          <a href="editbus_list.jsp">Delete Bus </a>
                        </div>
                      </div>
                      <div class="dropdown  fright">
                          <button class="dropbtn">Staff</button>
                        <div class="dropdown-content">
                           
                          <a href="add_staff.jsp">Add Staff</a>
                          <a href="editstaff_list.jsp">Update/Delete Staff </a>
                        </div>
                      </div>
                          
                         
                          
                          
                 </div>

    <div class="container1" style="width:100%;height:80%;position:absolute">

            
    <script>
         function msgfunction(){ </script>
  <%
      
   String sAction = (String) request.getAttribute("error"); %> 
    <% if(sAction=="Invalid user or password"){ %>
    <script>
        alert("Invalid Username Or Password");
        
        </script><% } 
     String aSuccess=  (String) request.getAttribute("success");
String name = (String) request.getAttribute("name");
System.out.println("name:"+name);
        %> 
    <% if(aSuccess=="Logged In Successfully"){ %>
    <script>
        alert("Logged In Successfully");
        //window.open("candidate_portal.jsp");
        </script><% }
if(aSuccess=="Profile Updated Successfully"){%>
<script>
        alert("Profile Updated Successfully");
        //window.open("candidate_portal.jsp");
        </script> <%}%>
<script> }</script>
     

</div>
        
</body>

</html>


