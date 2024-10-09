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
        <title>View Details Page</title>
        <style>
        body {
            background-image: url("img/img6.jpg");
            font-family: 'Times New Roman', Times, serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
            text-align: center; /* Center align text */
        }

        #title {
            margin-bottom: 20px; /* Space between title and form */
        }

        #Admin_reg {
            background-color: #fff;
            width: 450px;
            margin: 50px auto; /* Center the form vertically */
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            text-align: left; /* Align text within the form */
        }

        #Admin_reg h2 {
            font-size: 20px;
            margin-bottom: 20px;
            text-align: center; /* Center align form title */
        }

        table {
            width: 100%;
            margin: 0 auto;
            padding: 0;
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        input[type="text"],
        input[type="password"] {
            width: calc(100% - 20px);
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            display: block; /* Ensure input fields are block-level */
            margin-left: auto; /* Center input fields */
            margin-right: auto; /* Center input fields */
        }

        /* Button styling */
        .button-container {
            text-align: center; /* Center the buttons */
            margin-top: 20px; /* Space above buttons */
        }

        input[type="submit"],
        input[type="reset"],
        input[type="button"] {
            width: auto; /* Auto width for buttons */
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px; /* More padding for buttons */
            border: none;
            border-radius: 4px;
            cursor: pointer;
            margin: 5px; /* Space between buttons */
            display: inline-block; /* Align buttons in a line */
        }

        input[type="submit"]:hover,
        input[type="reset"]:hover,
        input[type="button"]:hover {
            background-color: #45a049;
        }
    </style>
        <link rel="stylesheet" href="style.css" type="text/css"/>
    </head>
    <body id="view">
       <div id="title">
            <h1>ONLINE BOOK FEEDBACK SUBMISSION</h1>
            <p>Your feedback may guide other readers in their choices and influence the book’s success.</p>
        </div>
                      
        
        
        <img src="img/im9.jpg" alt="Image Loading"/>
        <%
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/feedback","root","");
           
           Statement statement = con.createStatement() ;
          ResultSet resultset = statement.executeQuery("select * from addtrend") ;
       %>
       <table border="1">
           <tr>
               <th>BOOK NAME</th>
               <th>AUTHOR </th>
               <th>YEAR </th> 
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
       <br><input type="button" value="Add Trend Book" onclick="window.location='add_trendbook.jsp'" style="font-family: times new roman; font-size: 18px; "/>
       <input type="button" value="Add Trend Book Details" onclick="window.location='add_trend_details.jsp'" style="font-family: times new roman; font-size: 18px; "/>
       <input action="action"  onclick="window.location.href='index.jsp'"   type="button"  value="Logout" style="font-family: times new roman; font-size: 18px; ">
       

    </body>
</html>
