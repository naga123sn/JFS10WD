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

    <div class="first" style="width:100%;height:45px;">

           <div class="dropdown fright">
            <button class="dropbtn" onclick="location.href='index.jsp';">Logout</button>
        </div>



        
         <div class="dropdown fright">
                          <button class="dropbtn" onclick="location.href='userbooking.jsp';">Bookings</button>
                       </div>
         <div class="dropdown fright">
                          <button class="dropbtn" onclick="location.href='user_bus_list.jsp';">Bus List</button>
                       </div>
    
  
    
    </div>
        <div class="container1" style="width:100%;height:80%;position:absolute;">
                 
                   <table border="1" style="height:50px;width: 1000px;">
                       <br>
                        <h1 style='color:black;'>Bus</h1>
                        <br>
                        <tr>
                           
                             
                             <th> Bus number</th>
                              <th>Bus type</th>
                              <th> Date</th>
                             <th>Available Seat</th>
                              <th>Price</th>
                             <th>Source</th>
                              <th>Destination</th>
                             <th>Arrival Time</th>
                             <th>Departure Time</th>
                              <th>Book</th>
                             
    
                        </tr>
                      
                        <%  
                            Connection con;
Statement stmt;
Statement stmt1;
try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                
                   
                    
                       System.out.println("Driver Start");
                       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking", "root", "");
                      System.out.println("Getconnection Start");
                       stmt = con.createStatement();
                        stmt1 = con.createStatement();
                         String sql="select * from add_bus";
                       System.out.println(sql);
                       ResultSet rs=stmt.executeQuery(sql);
                        while (rs.next()) {
                            int id=rs.getInt(1); %>
                        <tr>
                           
                    
                     <td><% out.println(rs.getString(5)); %></td>
                        <td><% out.println(rs.getString(6)); %></td>
                        <td><% out.println(rs.getString(7)); %></td>
                        <td><%  out.println(rs.getString(9)); %></td>
                        <td><%  out.println(rs.getString(11)); %></td>
                         <td><%  out.println(rs.getString(12)); %></td>
                           <td><%  out.println(rs.getString(13)); %></td>
                             <td><%  out.println(rs.getString(14)); %></td>
                               <td><%  out.println(rs.getString(15)); %></td>
                        <td> 
                            <td> <a href="payment1.jsp?id=<%=id %>"><u>Book</a>  </td> </td>
               
                        
                        </tr>
                        <%  

                      }
                        }
                            catch(Exception e){
                               System.out.println(e);
                        }
                   
                    %>
                 
      
            </table>
   </div>
        
        
        
          
        
    </body>
</html>