
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
        <% String name;
            Connection con;
            Statement stmt = null, stmt1 = null;
            String doctorid = null, doctorname = null, genderr = null, specialist = null;%>
    </head>
    <script>   function back_funct() {

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
                                  <button class="dropbtn" onclick="location.href='#';">Bus</button>
                                  <div class="dropdown-content">
                           
                          <a onclick="location.href='bus_list.jsp';">Add Schedule</a>
                          <a onclick="location.href='schedule_list.jsp';"">View Bus </a>
                        </div>
                          </div>
                     
                       <div class="dropdown fright">
                          <button class="dropbtn" onclick="location.href='payment_staff.jsp';" >Bill</button>
                       </div>
                         


        </div>
        <div class="container1" style="width:100%;height:80%;position:absolute">
            <form name="add_staff" class="registartion-form"  method="post">

                <table>
                    <br>
                    <h1 style='color:black;'><center>Bus</center></h1>
                   




                    <tr>
                        <td><label for="amount">Driver Name </label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="driver" id="amount"  required="required"></td> 
                    </tr>
                    <tr>
                        <td><label for="amount">Mobile </label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="phone" id="amount"   required="required"></td> 
                    </tr>
                    <tr>
                        <td><label for="amount">Date </label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="date" id="amount"   required="required"></td> 
                    </tr>

  <tr>
                        <td><label for="amount">Total Seat </label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="oseat" id="amount"  required="required"></td> 
                    </tr>
                    <tr>
                        <td><label for="amount">Available Seat </label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="aseat" id="amount"   required="required"></td> 
                    </tr>
                    <tr>
                        <td><label for="amount">Booked Seat </label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="bseat" id="amount"   required="required"></td> 
                    </tr>
  <tr>
                        <td><label for="amount">Price</label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="price" id="amount" placeholder="" required="required"></td> 
                    </tr>
                    <tr>
                        <td><label for="amount">Source </label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="source" id="amount"   required="required"></td> 
                    </tr>
                    <tr>
                        <td><label for="amount">Destination </label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="destination" id="amount"   required="required"></td> 
                    </tr>
                     <tr>
                        <td><label for="amount">Arrival Time </label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="atime" id="amount" placeholder="" required="required"></td> 
                    </tr>
                    <tr>
                        <td><label for="amount">Departure Time </label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="dtime" id="amount"   required="required"></td> 
                    </tr>
                    <tr>
                     <center>    <td>    
                    <button id="back" onclick="<% int id = 0;
                        String username1;
                        String h = null;
                        String busname=null,busno=null,type=null;
                        try {
                            String idd = request.getParameter("id").toString();
                            Class.forName("com.mysql.cj.jdbc.Driver");

                            System.out.println("Driver Start");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking", "root", "");
                            System.out.println("Getconnection Start");
                            stmt = con.createStatement();
                            stmt1 = con.createStatement();
                            String sqll = "select * from bus where id='" + idd + "'";
                            System.out.println(sqll);
                            ResultSet rs = stmt.executeQuery(sqll);
                            while (rs.next()) {
                                id = rs.getInt(1);
                                busno=rs.getString(2);
                                busname=rs.getString(3);
                                type=rs.getString(6);
                            }

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        try {

                            Class.forName("com.mysql.cj.jdbc.Driver");
                            System.out.println("Driver Start");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking", "root", "");
                            System.out.println("Getconnection Start");
                            stmt = con.createStatement();
                            stmt1 = con.createStatement();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }


                        String driver = request.getParameter("driver");
                        System.out.println(driver);
                        String phone = request.getParameter("phone");
                        System.out.println(phone);
                       String date = request.getParameter("date");
                        System.out.println(phone);
                         String oseat = request.getParameter("oseat");
                        System.out.println(phone);
                        String aseat = request.getParameter("aseat");
                        System.out.println(phone);
                        String bseat = request.getParameter("bseat");
                        System.out.println(phone); 
                        String price = request.getParameter("price");
                        System.out.println(phone);
                         String source = request.getParameter("source");
                        System.out.println(phone);
                        String destination = request.getParameter("destination");
                        System.out.println(phone);
                        String atime = request.getParameter("atime");
                        System.out.println(phone); 
                        String dtime = request.getParameter("dtime");
                        System.out.println(phone);
                        
                        
                        if (driver != null) {
                           
                                    String sql = "INSERT INTO add_bus (driver_name,phone,bus_name,bus_number,bus_type,date,original_seat,available_seat,booked_seat,price,source,destination,atime,dtime) "
                                            + "values ('" + driver + "','" + phone + "','" + busname + "','" + busno + "','" + type + "','" +date + "','" + oseat + "','" + aseat + "','" + bseat + "','" + price + "','" + source + "','" + destination + "','" + atime + "','" + dtime+ "')";
                                    System.out.println(sql);
                                    stmt.executeUpdate(sql);

                                    if (true) {
                                        System.out.println("Start");

//                      response.sendRedirect("staffdoctor_list1.jsp");
                                    }
                                }
                            
                        
                        /*else if(rs1.next()){
                      System.out.println("Start");
                      
                      request.setAttribute("success", "Logged In Successfully");
                      request.setAttribute("name", rs1.getString(1));
               
                      System.out.println("After success Set Attributes");
                      RequestDispatcher rd=request.getRequestDispatcher("Staff.jsp");
                      rd.forward(request,response);
                  }*/


%>">Submit</button></td></center>
                    </tr>
                </table></form>
        </div>
               
    </body>
</html>