

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%-- 
    Document   : acceptpayment.jsp
    Created on : Sep 2, 2023, 9:38:43 AM
    Author     : CMP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <%  String available=null,bn=null,bseat=null;
String booked=null,avail=null,bookedd=null;
String iid=null;
          Connection con;
          Statement stmt,stmt1;
          try{
              Class.forName("com.mysql.cj.jdbc.Driver");
                 System.out.println("Driver Start");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking", "root", "");
                System.out.println("Getconnection Start");
             stmt = con.createStatement();
             stmt1 = con.createStatement();

        

                  int Busno = Integer.parseInt(request.getParameter("id"));

           
            
Class.forName("com.mysql.jdbc.Driver");

Statement statement=con.createStatement();
String sql ="select bus_number,seats from booking WHERE id="+Busno;
ResultSet rs = statement.executeQuery(sql);
while(rs.next()){
bn=rs.getString(1);
bseat=rs.getString(2);
    
}
  System.out.println(bn + "    bus number and booked seat     "+bseat );           
  try{                
String sqll ="select available_seat,booked_seat from add_bus WHERE bus_number="+bn;
ResultSet rss = statement.executeQuery(sqll);
while(rss.next()){
avail=rss.getString(1);
bookedd=rss.getString(2);

}System.out.println(avail + "    old available and old booked seat     "+bookedd);        }
catch(Exception r)
{
System.out.println("R   "+r);
}
  
int na=(Integer.parseInt(avail))+(Integer.parseInt(bseat));
System.out.println(na);
int ba=(Integer.parseInt(bookedd))-(Integer.parseInt(bseat));
available=Integer.toString(na);
booked=Integer.toString(ba);
System.out.println(booked);
System.out.println("Data updated successfully");
try{
  String query = "update add_bus set available_seat=?,booked_seat=? where bus_number="+bn;
                PreparedStatement pss = con.prepareStatement(query);

                pss.setString(1,available);
                pss.setString(2, booked);
pss.executeUpdate();}
catch(Exception k)
{
System.out.println("k    "+k);
}
System.out.println("hoooo");
            
                
System.out.println("hi");
                System.out.println("Data updated successfully");

       statement=con.createStatement();
       PreparedStatement ps=con.prepareStatement("DELETE from booking  WHERE id="+Busno);
                    ps.executeUpdate();

    response.sendRedirect("userbooking.jsp");
            
                 }
    catch(Exception e){
        e.printStackTrace();
}  %>
   