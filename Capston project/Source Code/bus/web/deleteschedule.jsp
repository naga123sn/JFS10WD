

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

        

                  int staff_id = Integer.parseInt(request.getParameter("id"));

           
                 if(staff_id==0)
                 {
                     System.out.println("Error");
                         

                 }
                 else
                 {
                     System.out.println("before update:"+staff_id);
                     String sql = "delete from add_bus where id='"+staff_id+"'";
                        System.out.println("Frst:"+sql);
                       stmt.executeUpdate(sql);
                           System.out.println(sql);
                             response.sendRedirect("schedule_list.jsp");

                          
                          
                 }
                 }
    catch(Exception e){
        System.out.println(e);
}
        
        %>
   




