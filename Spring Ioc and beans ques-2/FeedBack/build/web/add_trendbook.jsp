<%-- 
    Document   : add_course
    Created on : 26 Aug, 2023, 9:13:44 AM
    Author     : CMP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Book Page</title>
        <style>
        body {
            background-image: url("img/img7.jpg");
            font-family: 'Times New Roman', Times, serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
            text-align: center; /* Center align text */
        }

   
        table {
            width: 50%;
            margin: 0 auto;
            padding: 0;
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        input[type="text"],
        input[type="password"] {
            width:75%;
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
            width: 25%; /* Auto width for buttons */
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
                 var book=document.forms["f1"]["book"].value;
                 var author=document.forms["f1"]["author"].value;
                 var year=document.forms["f1"]["year"].value;
                
                 
                 if(book=="" || author=="" || year==""){
                     alert("Please check all field the book details");
                 }
                 
                 else{
                     alert("Book Details Addded Successfully");

                 }
            }
             
          </script>
    </head>
    <body id="addd">
        <div id="title">
            <h1>ONLINE BOOK FEEDBACK SUBMISSION</h1>
            <p>The more that you read, the more things you will know. The more that you learn, the more places you’ll go</p>
        </div>
          <div >
         <form method="post" name="f1"  onsubmit="return Disp()">
             <h2>ADD BOOK</h2>
             <table name="table">
                 
                 <tr>
                     <th align="left"> BOOK: </th>
                     <td><input type="text" id="book" name="book" value=""/> </td>
                 </tr>
                 <br>
                    <br>
                 <tr>
                     <th align="left">AUTHOR: </th>
                      <td><input type="text" id="author" name="author" value=""/> </td>
                 </tr>
                    <br>
                       <br>
               <tr>
                     <th align="left"> YEAR: </th>
                     <td><input type="text" id="year" name="year" value=""/> </td>
                 </tr>
               
                 
                 
             </table>
             
             
             <%
                
               
             try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/feedback","root","");
                 
                 System.out.print("success");
                 String book=request.getParameter("book");
                 String author=request.getParameter("author");
                 String year=request.getParameter("year");
                 Statement statement = con.createStatement() ;
           ResultSet resultset = statement.executeQuery("select * from addtrend") ;
                  
                  
                  if((!book.equals("") && !author.equals("")&& !year.equals("")) ){
                      
                 PreparedStatement pt=con.prepareStatement("insert into addtrend values(?,?,?)");
                 pt.setString(1, book);
                 pt.setString(2, author); 
                 pt.setString(3, year); 
                 
                      
                 
                     
                 
                 pt.executeUpdate();
                  }
             }
             catch(Exception e){
                 System.out.println(e);
       }
                  
                         
             
             %>
             <input type="submit" value="Submit" value="Back" style="font-family: times new roman; font-size: 18px; "/>
             <input action="action"
    onclick="window.location.href='viewdetails.jsp'"
    type="button"
    value="Back" style="font-family: times new roman; font-size: 18px; ">
           
             
         </form>
     </div>

        
    </body>
</html>
