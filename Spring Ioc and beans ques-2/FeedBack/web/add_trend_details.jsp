<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Trend Book Details Page</title>
        <style>
            body {
                background-image: url("img/img7.jpg");
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
        <script language="javascript">
            function Disp() {
                var book = document.forms["f1"]["book"].value;
                var price = document.forms["f1"]["price"].value;
                var description = document.forms["f1"]["description"].value;
                var materiallink = document.forms["f1"]["materiallink"].value;
                if (book == "" || price == "" || description == "" || materiallink == "") {
                    alert("Please check all fields");
                    return false; // Prevent form submission
                }
                return true; // Allow form submission
            }
            function Disp1() {
                alert("Book Details Added Successfully");
            }
        </script>
    </head>
    <body>
        <div id="title">
            <h1>ONLINE BOOK FEEDBACK SUBMISSION</h1>
            <p>Reading gives us someplace to go when we have to stay where we are.</p>
        </div>
        
        <form method="post" name="f1" onsubmit="return Disp()">
            <h2>ADD TREND BOOK</h2>
            <%
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/feedback", "root", "");
                Statement statement = con.createStatement();
                ResultSet resultset = statement.executeQuery("select * from addtrend");
            %>
            <table>
                <tr> 
                    <th>Book Name:</th>
                    <td>
                        <select name="book" required>
                            <% while(resultset.next()) { %>
                                <option><%= resultset.getString(1) %></option>
                            <% } %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>Price:</th>
                    <td><input type="text" id="price" name="price" required /></td>
                </tr>
                <tr>
                    <th>Description:</th>
                    <td><textarea id="description" name="description" rows="5" required></textarea></td>
                </tr>
                <tr>
                    <th>Material Link:</th>
                    <td><input type="text" id="materiallink" name="materiallink" required /></td>
                </tr>
            </table>
            <%
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String book = request.getParameter("book");
                    String price = request.getParameter("price");
                    String description = request.getParameter("description");
                    String materiallink = request.getParameter("materiallink");
                    
                    if (!book.equals("") && !price.equals("") && !description.equals("") && !materiallink.equals("")) {
                        PreparedStatement pt = con.prepareStatement("insert into addtrenddetails values(?,?,?,?)");
                        pt.setString(1, book);
                        pt.setString(2, price);
                        pt.setString(3, description);   
                        pt.setString(4, materiallink);
                        pt.executeUpdate();
            %>
                        <script>Disp1();</script>
            <%
                    }
                } catch(Exception e) {
                    System.out.println(e);
                }
            %>
            <div class="button-container">
                <input type="submit" value="Submit"/>
                <input type="button" onclick="window.location.href='viewdetails.jsp'" value="Back"/>
            </div>
        </form>
    </body>
</html>
