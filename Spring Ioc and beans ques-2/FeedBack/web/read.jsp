<%-- 
    Document   : study
    Created on : 29 Aug, 2023, 2:27:40 PM
    Author     : CMP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>course Page</title>
        <link rel="stylesheet" href="style.css" type="text/css"/>
    </head>
    <body id="view">
        <div id="title">
            <h1>ONLINE BOOK FEEDBACK SUBMISSION</h1>
            <p>Books are a uniquely portable magic...</p>
        </div>
       
        <%
            String book = request.getParameter("book");
            try{
                         Class.forName("com.mysql.cj.jdbc.Driver");
                         Connection con=DriverManager.getConnection("jdbc:mysql://localhost/feedback","root","");
                         Statement statement = con.createStatement() ;
                        
                        String sql ="select * from addtrenddetails where book='"+book+"'";
                        ResultSet resultset = statement.executeQuery(sql); %>
   
    
    <form method="post" >
        <table border="1">
            <tr>
              
               
               <th>Book Name</th>
               <th>Description</th>
               <th>Material Link</th>
               
                             
           </tr>
          <% while(resultset.next()){ %>
           <tr>
               
               <td>   <%= resultset.getString("book") %>    </td> 
               <td>    <%= resultset.getString("description") %>    </td> 
               <td> <a href="<%= resultset.getString("materiallink") %>" target="_blank"><%= resultset.getString("materiallink") %></a></td>
               
               <%--<td> <a href="topicmaterial.jsp?topicname=<%= resultset.getString("topicname") %>">Materials</a>--%>
               </td>
               
               
             
           </tr>
            <%}%>
            
        </table>


</form>
       
    
     <% 
}
     catch (Exception e) {
e.printStackTrace();
}%>
    </body>
</html>
