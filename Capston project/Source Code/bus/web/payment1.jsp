<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ResultSet rs1;
    String r = null;
    String s = null;
    String x = null, y = null, z = null, p = null, o = null, u = null, v = null, t1 = null, t2 = null, t3 = null;
    String busno = null, source = null, destination = null, date = null, price = null, Rp = null, Bseat = null;
    int available_seat=0,booked_seat=0;
    int realpayment;
%>
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
function call(){
    
    alert("Ticket Booked Successfully!");
  
 
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

        <div class="first" style="width:100%;height:45px;">

            <div class="dropdown fright">
                <button class="dropbtn" onclick="location.href = 'http://localhost:8080/bus/index.jsp';">Logout</button>
            </div>



          

            <div class="dropdown fright">
                <button class="dropbtn" onclick="location.href = 'http://localhost:8080/bus/userbooking.jsp';" >Bookings</button>
            </div>
            <div class="dropdown fright">
                <button class="dropbtn" onclick="location.href = 'http://localhost:8080/bus/user_bus_list.jsp';" >Bus List</button>
            </div>


        </div>

    <center>
        <div class="container" style="width:100%;height:100%;position:absolute">

            <script type="text/javascript" src="js/fileselection.js"></script>

            <form name="buy_plan" class="registartion-form"  method="post">
                <table> 
                    <h1 style='color:black;'>Payment</h1>


                    <%
                        int iid = Integer.parseInt(request.getParameter("id"));

                        String name = (String) session.getAttribute("p");

                        System.out.println(iid);
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        System.out.println("Driver Start");
                        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking", "root", "");
                        System.out.println("Getconnection Start");
                        Statement stmt2 = con1.createStatement();
                        Statement stmt3 = con1.createStatement();
                        System.out.println(iid);
                        String query = "select * from add_bus where id='" + iid + "'";
                        rs1 = stmt2.executeQuery(query);

                        while (rs1.next()) {

                            busno = rs1.getString(5);

                            date = rs1.getString(7);
available_seat=rs1.getInt(9);
booked_seat=rs1.getInt(10);
                            source = rs1.getString(12);
                            price = rs1.getString(11);
                            destination = rs1.getString(13);

                    %> 
                    <tr>


                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="hidden"  name="from" id="from" value="<%=busno%>" ></td> 


                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="hidden" name="did" id="to" value="<%=date%>" >
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="hidden" name="dn" id="to" value="<%=source%>" ></td> 
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="hidden" name="g" id="to" value="<%=destination%>" ></td> 


                    </tr>
                    <%
                        }

                        u = session.getAttribute("p").toString();
                        v = session.getAttribute("l").toString();

                    %>

                    <tr>
                        <td><label for="amount">Enter No of Seats </label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="bseat" id="amount" value="" placeholder="Ex: 1 or 2" required="required"></td> 
                     </tr>
                    <tr>
                        <td><label for="amount">Amount in Rs.: </label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="amount" id="amount" value=" " placeholder="Ex: 500" required="required"></td> 
                    </tr>

                    <tr>
                        <td><label for="Bank Name">Bank Name: </label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="bank" id="bank" placeholder="Ex: SBI" required="required"></td> 
                    </tr> 
                    <tr>
                        <td><label for="Account No">Account No: </label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="account" id="account" placeholder="Ex: 123456845126523" required="required"></td> 
                    </tr> 
                    <tr>
                        <td><label for="Card No">Card No: </label></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="card" id="card" placeholder="Ex: 256" required="required"></td> 
                    </tr> 



                    <tr>
                        <td>
                    <button id="back" onclick=" <%
              try {
                  String account = null, amount = null, card = null, sp = null, di = null, un = null, dn = null, bank = null, ui = null, time = null;
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bus_booking", "root", "");
                  Statement stmt = con.createStatement();
                  Statement stmt1 = con.createStatement();
                  amount = request.getParameter("amount");
                  if (amount != null) {
                      System.out.println("iiiiii" + amount);
//                  String sqll="select * from doctor_l
                      bank = request.getParameter("bank");
                      System.out.println(amount);
Bseat=request.getParameter("bseat");
                      System.out.println(amount);
                      account = request.getParameter("account");
                      System.out.println(amount);
                      card = request.getParameter("card");
                      System.out.println(card);
                      un = session.getAttribute("p").toString();
                      System.out.println(un);
                      ui = session.getAttribute("l").toString();
                      System.out.println(ui);
                      String up = session.getAttribute("ph").toString();
                      System.out.println(up);
                      String sql = "INSERT INTO booking(username,userid,phone,bus_number,date,source,destination,seats,amount)values ('" + un + "','" + ui + "','" + up + "','" + busno + "','" + date + "','" + source + "','" + destination + "','" + Bseat + "','" + amount + "')";
                      System.out.println(sql);
                      stmt.executeUpdate(sql);
                      
                      
                      String sql2 = "INSERT INTO payment(username,user_id,amount,bank,account,card,booking_status,payment_status)values ('" + un + "','" + ui + "','" + amount + "','" + bank + "','" + account + "','" + card + "','" + "Booked" + "','" + "Paid" + "')";
                      System.out.println(sql2);
                      stmt.executeUpdate(sql2);
                      

                      int modify_seat=Integer.parseInt(Bseat);
                      
                      int after_booking=available_seat - modify_seat;
                      int Booked=booked_seat+modify_seat;
                       String sql3 = "Update add_bus set available_seat='"+after_booking+"', booked_seat='"+Booked+"' where id='" + iid + "'";
System.out.println("Frst:"+sql3);
                       stmt.executeUpdate(sql3);
                      
                  }
              }
                  catch(Exception e)
                          {
                          System.out.println(e);
                          }
                      
%>call()"> Pay </button></td>
                    </tr>


                </table>



            </form>
        </div>
    </center>

</body>
</html>