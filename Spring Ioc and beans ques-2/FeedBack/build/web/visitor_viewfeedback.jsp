<%-- 
    Document   : viewqueries
    Created on : 28 Aug, 2023, 11:33:52 AM
    Author     : CMP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Feedback Page</title>
                <style>
            body {
                background-image: url("img/img6.jpg");
                font-family: 'Times New Roman', Times, serif;
                background-color: #f2f2f2;
                margin: 0;
                padding: 20px; /* Added padding for better spacing */
                text-align: center; /* Center align text */
            }

            #title {
                margin-bottom: 30px;
            }

            table {
                width: 60%; /* Increased width for better spacing */
                margin: 0 auto; /* Center the table */
                border-collapse: collapse; /* Remove space between table cells */
                background-color: rgba(255, 255, 255, 0.9); /* Slightly transparent background */
                border-radius: 8px; /* Rounded corners */
                box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1); /* Subtle shadow for depth */
            }

            th, td {
                padding: 12px; /* Increased padding */
                text-align: left;
                border-bottom: 1px solid #ddd; /* Light border for separation */
            }

            th {
                background-color: #4CAF50; /* Header background color */
                color: white; /* Header text color */
            }

            input[type="text"],
            textarea {
                width: 90%; /* Adjusted width for inputs */
                padding: 10px; /* Increased padding */
                margin: 10px auto; /* Center input fields */
                border: 1px solid #ccc;
                border-radius: 4px;
                display: block; /* Ensure input fields are block-level */
            }

            select {
                width: 90%; /* Adjusted width for select box */
                padding: 10px; /* Increased padding */
                margin: 10px auto; /* Center select box */
                border: 1px solid #ccc;
                border-radius: 4px;
                background-color: white; /* White background for select */
                appearance: none; /* Remove default arrow */
                -moz-appearance: none; /* For Firefox */
                -webkit-appearance: none; /* For Safari */
                background-image: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 20 20"><polygon points="0,0 20,0 10,10" fill="gray"/></svg>'); /* Custom arrow */
                background-repeat: no-repeat;
                background-position: right 10px center; /* Position the arrow */
                background-size: 12px; /* Size of the arrow */
            }

            /* Button styling */
            .button-container {
                text-align: center; /* Center the buttons */
                margin-top: 20px; /* Space above buttons */
            }

            input[type="submit"],
            input[type="reset"],
            input[type="button"] {
                width: 30%; /* Auto width for buttons */
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
         <script language="javascript">
             function Disp(){
                
                    
                     alert("update Successfully");

            }
             
          </script>
    </head>
    <body id="view">
         <div id="title">
            <h1>ONLINE BOOK FEEDBACK SUBMISSION</h1>
            <p>Writing feedback helps you clarify your thoughts and feelings about what you read, deepening your understanding.</p>
        </div>
        <h1>Feedback Section</h1>
        
        <%
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/feedback","root","");
           
           Statement statement = con.createStatement() ;
          ResultSet resultset = statement.executeQuery("select * from addfeedback") ;
       %>
       <form method="post" name="f1"  >
       <table border="1">
           <tr>
           
               <th>Book Name</th>
               <th>Feedback</th>
               
               
                             
           </tr>
           <% while(resultset.next()){ %>
           <tr>
               
              
               <td> <%= resultset.getString("book") %>   </td>
               <td>   <%= resultset.getString("feedback") %>    </td> 
           
             
           </tr>
           <% } %>
       </table>
           
       
      
<input action="action"
    onclick="window.location.href='visitor_viewtrendbook.jsp'"
    type="button"
    value="Back" style="font-family: times new roman; font-size: 18px; ">
    </body>
</html>
