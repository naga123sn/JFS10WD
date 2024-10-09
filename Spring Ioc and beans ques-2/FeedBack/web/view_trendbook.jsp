<%-- 
    Document   : view_course
    Created on : 25 Aug, 2023, 5:24:04 PM
    Author     : CMP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Trending Book Page</title>
        <link rel="stylesheet" href="style.css" type="text/css"/>
    </head>
    <body id="view">
       <div id="title">
            <h1>ONLINE BOOK FEEDBACK SUBMISSION</h1>
            <p>Actively engaging with a book through feedback enhances your reading experience.</p>
        </div>
                      
        
        
        <img src="images/im7.png" alt="Image Loading"/>
        <%
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/feedback","root","");
           
           Statement statement = con.createStatement() ;
          ResultSet resultset = statement.executeQuery("select * from addtrend") ;
       %>
       <table border="1">
           <tr>
               <th>Book Name</th>
               <th>Author</th>        
               <th>Year</th>
           </tr>
           <% while(resultset.next()){ %>
           <tr>
               <td>
                   <%= resultset.getString(1) %>
               </td>
               <td>
                   <%= resultset.getString(2) %>
               </td>
                <td>
                   <%= resultset.getString(3) %>
               </td>
           </tr>
            <% } %>
       </table><br>
       <br><input type="button" value="Add Book" onclick="window.location='viewdetails.jsp'" style="font-family: times new roman; font-size: 18px; "/>
       <input type="button" value="Add Topic" onclick="window.location='addtopic.jsp'" style="font-family: times new roman; font-size: 18px; "/>
       <input action="action"  onclick="window.location.href='index.jsp'"   type="button"  value="Logout" style="font-family: times new roman; font-size: 18px; ">
       

    </body>
</html>
