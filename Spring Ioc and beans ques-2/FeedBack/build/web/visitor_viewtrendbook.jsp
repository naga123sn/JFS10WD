<%-- 
    Document   : stuview_course
    Created on : 26 Aug, 2023, 5:39:41 PM
    Author     : CMP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Course Page</title>
                <style>
            body {
                background-image: url("img/img3.jpg");
                font-family: 'Times New Roman', Times, serif;
                background-color: #f2f2f2;
                margin: 0;
                padding: 0;
                text-align: center;
            }

            #title {
                margin-bottom: 20px;
            }

            #login {
                width: 400px; /* Fixed width for the form */
                margin: 0 auto; /* Center the form */
                background-color: rgba(255, 255, 255, 0.9); /* Slightly transparent background */
                border-radius: 8px; /* Rounded corners */
                box-shadow: 0 2px 10px rgba(0, 0, 0, 0.2); /* Subtle shadow for depth */
                padding: 20px; /* Padding around the form */
            }

            h2 {
                margin-bottom: 20px; /* Space below the heading */
            }

            label {
                display: block; /* Ensure labels take full width */
                margin: 10px 0 5px; /* Space around labels */
            }

            input[type="text"],
            input[type="password"] {
                width: calc(100% - 16px); /* Full width minus padding and border */
                padding: 8px; /* Padding */
                border: 1px solid #ccc;
                border-radius: 4px;
                margin-bottom: 15px; /* Space below inputs */
            }

            /* Button styling */
            input[type="submit"],
            input[type="reset"] {
                width: 70%; /* Width for buttons */
                background-color: #4CAF50;
                color: white;
                padding: 10px; /* Padding for buttons */
                border: none;
                border-radius: 4px;
                cursor: pointer;
                margin: 5px; /* Space between buttons */
            }

            input[type="submit"]:hover,
            input[type="reset"]:hover {
                width: 70%;
                background-color: #45a049; /* Hover effect */
            }

            ul {
                list-style: none; /* Remove bullet points */
                padding: 0; /* Remove padding */
            }

            li {
                margin-top: 10px; /* Space above links */
            }
        </style>
        <link rel="stylesheet" href="style.css" type="text/css"/>
    </head>
    <body id="view">
        <div id="title">
            <h1>ONLINE BOOK FEEDBACK SUBMISSION</h1>
            <p>Your feedback can help authors and publishers enhance their work, leading to better quality books.</p>
        </div>
        <h1>BOOK DETAILS</h1>
        <%
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/feedback","root","");
           
           Statement statement = con.createStatement() ;
          ResultSet resultset = statement.executeQuery("select * from addtrenddetails") ;
       %>
       <table border="1">
           <tr>
               <th>Book Name</th>
                <th>Price</th>
               <th>Description</th>    
               <th>Material link</th> 
                <th>Start Read</th> 
           </tr>
           <% while(resultset.next()){ %>
           <tr>
               <td>
                   <%= resultset.getString("book") %>
               </td>
                <td>
                   <%= resultset.getString("price") %>
               </td>
               <td>
                   <%= resultset.getString("description") %>
               </td>
                <td>
                   <%= resultset.getString("materiallink") %>
               </td>
               <td> <a href="read.jsp?book=<%= resultset.getString("book") %>">START</a></td>
           </tr>
            <% } %>
       </table>
        <br><input type="button" value="ADD FEEDBACK" onclick="window.location='addfeedback.jsp'" style="font-family: times new roman; font-size: 18px; "/>
       <input action="action"
    onclick="window.location.href='visitor_viewfeedback.jsp'"
    type="button"
    value="FEEDBACK" style="font-family: times new roman; font-size: 18px; ">
      <input action="action"  onclick="window.location.href='index.jsp'"   type="button"  value="LOGOUT" style="font-family: times new roman; font-size: 18px; ">
       

    </body>
</html>
