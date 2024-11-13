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
    background-color:white;
    color:black;
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
     System.out.println(Y);

 /*   if(name2.isEmpty()){
      name2 = request.getParameter("name");
    }*/
   
     %>
       <div class="first" style="width:100%;height:45px;">
                     <h2 class="topnav-name fleft" title="name" >ONLINE BUS TICKET BOOKING</h2>
      
                     
                     <div class="dropdown fright">
                           <button class="dropbtn" onclick="location.href='index.jsp';">Logout</button>
                          </div>
                           
                          
                      
                            <div class="dropdown fright"> 
                                  <button class="dropbtn" onclick="location.href='#';">Bus</button>
                                  <div class="dropdown-content">
                           
                          <a onclick="location.href='add_bus_list.jsp';">Add Schedule</a>
                          <a onclick="location.href='schedule_list.jsp';">View Bus </a>
                        </div>
                          </div>
                     
                       <div class="dropdown fright">
                          <button class="dropbtn" onclick="location.href='payment_staff.jsp';" >Bill</button>
                       </div>
                         
                          
                         
                          
                 </div>
        <div class="container1" style="width:100%;height:80%;position:absolute">
                         <table border="1" style="height:50px;width: 1000px;">
                       <br>
                        <h1 style='color:black;'>Bus</h1>
                        <br>
                        <tr>
                           
                             <th style="height: auto;width:100px;"> ID</h>
                           <th style="height: auto;width:100px;">Bus Name</th>
                             <th>Model </th>
                                  <th>Type</th>
                                  <th>Add</th>
                                  
                                
                                
                             
    
                        </tr>
                      
                        <%  try{
                             Connection con;
Statement stmt;
Statement stmt1;
                    Class.forName("com.mysql.cj.jdbc.Driver");
                
                    
                       System.out.println("Driver Start");
                       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking", "root", "");
                      System.out.println("Getconnection Start");
                       stmt = con.createStatement();
                        stmt1 = con.createStatement();
                         String sql="select * from bus";
                       System.out.println(sql);
                       ResultSet rs=stmt.executeQuery(sql);
                        while (rs.next()) 
{ int id=rs.getInt(1);%>
                        <tr>
                           
                     <td style="height: 50px;width:70px;"> <% out.println(rs.getInt(1)); %> </td>
                   
                        <td><% out.println(rs.getString(3)); %></td>
                        <td><% out.println(rs.getString(4)); %></td>
                        <td><%  out.println(rs.getString(6)); %></td>
                        <td>     
           
                        
                         <a  onclick="location.href='add_bus_list1.jsp';"><u>Add</u></a></td>
                         
                        
                        
                        </tr>
                        <%  

                      }
                        }
                            catch(Exception e){
                                e.printStackTrace();
                        }
                   
                    %>
                 
      
            </table>
   </div>
  
</body>
</html>