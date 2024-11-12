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
<% String name;%>
</head>
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
 String Y = (String) session.getAttribute("y");
     System.out.println("att  "+Y);

 /*   if(name2.isEmpty()){
      name2 = request.getParameter("name");
    }*/
   
     %>
       <div class="first" style="width:100%;height:45px;">
                     <h2 class="topnav-name fleft" title="name" >ONLINE BUS TICKET BOOKING SYSTEM</h2>
      
                     <div class="dropdown fright">
                           <button class="dropbtn" onclick="location.href='http://localhost:8080/bus/index.jsp';">Logout</button>
                          </div>
                           
                          
                      
                          <div class="dropdown fright"> 
                                  <button class="dropbtn" onclick="location.href='#';">Bus</button>
                                  <div class="dropdown-content">
                           
                          <a href="bus_list.jsp">Add Schedule</a>
                          <a href="schedule_list.jsp">View Bus </a>
                        </div>
                          </div>
                     
                       <div class="dropdown fright">
                          <button class="dropbtn" onclick="location.href='http://localhost:8080/bus/payment_staff.jsp';" >Bill</button>
                       </div>
                         
                          
                 </div>
        <div class="container1" style="width:100%;height:80%;position:absolute">
   
</body>
</html>