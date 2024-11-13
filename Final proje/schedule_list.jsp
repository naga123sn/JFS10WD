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
            System.out.println(Y);

            /*   if(name2.isEmpty()){
        name2 = request.getParameter("name");
      }*/

        %>
        <div class="first" style="width:100%;height:45px;">
            <h2 class="topnav-name fleft" title="name" >ONLINE BUS TICKET BOOKING SYSTEM</h2>

            <div class="dropdown fright">
                <button class="dropbtn" onclick="location.href='index.jsp';">Logout</button>
            </div>



            <div class="dropdown fright"> 
                <button class="dropbtn" onclick="location.href = '#';">Bus</button>
                <div class="dropdown-content">

                    <a onclick="location.href='add_bus_list1.jsp';">Add Schedule</a>
                    <a onclick="location.href='schedule_list.jsp';">View Bus </a>
                </div>
            </div>

            <div class="dropdown fright">
                <button class="dropbtn" onclick="location.href='payment_staff.jsp';">Bill</button>
            </div>



        </div>
        <div class="container1" style="width:100%;height:80%;position:absolute">

            <table border="1" style="height:50px;width: 1000px;">
                <br>
                <h1 style='color:black;'>Schedule</h1>
                <br>
                <tr>


                    <th> ID</th>

                    <th>Bus number</th>

                    <th>Date</th>
                    <th>Total Seat</th>
                    <th>Available Seat</th>
                    <th>Booked Seat</th>
                    <th>Price</th>
                    <th>Source</th>
                    <th>Destination</th>
                    <th>Arrival Time</th>
                    <th>Departure Time</th>
 <th>Delete</th>
                </tr>

                <%   Connection con;
                    Statement stmt;
                    Statement stmt1;
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        System.out.println("Driver Start");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking", "root", "");
                        System.out.println("Getconnection Start");
                        stmt = con.createStatement();
                        stmt1 = con.createStatement();
                        String sql = "select * from add_bus";
                        System.out.println(sql);
                        ResultSet rs = stmt.executeQuery(sql);
                                while (rs.next()) {
                                    int id = rs.getInt(1);%>
                <tr>

                    <td style="height: 50px;width:70px;"> <% out.println(rs.getString(1)); %> </td>



                    <td><% out.println(rs.getString(5)); %></td>

                    <td><%  out.println(rs.getString(7)); %></td>
                    <td><%  out.println(rs.getString(8)); %></td>
                    <td><% out.println(rs.getString(9)); %></td>
                    <td><% out.println(rs.getString(10)); %></td>
                    <td><% out.println(rs.getString(11)); %></td>  <td><% out.println(rs.getString(12)); %></td>
                    <td><% out.println(rs.getString(13)); %></td>
                    <td><% out.println(rs.getString(14)); %></td>
                    <td><% out.println(rs.getString(15));%></td>




                    <td>   
                        
                     <a href="deleteschedule.jsp?id=<%= rs.getInt(1) %>"><u>Delete</u></a>
                    </td>


                </tr>
                <%

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                %>
            </table>
        </div>
       
    </body>
</html>