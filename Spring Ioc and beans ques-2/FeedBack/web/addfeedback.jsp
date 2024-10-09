<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>ADD FEEDBACK PAGE</title>
    <style>
        body {
            background-image: url("img/img6.jpg");
            font-family: 'Times New Roman', Times, serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 20px; 
            text-align: center; 
        }

        #title {
            margin-bottom: 30px;
        }

        table {
            width: 70%; 
            margin: 0 auto; 
            border-collapse: collapse; 
            background-color: rgba(255, 255, 255, 0.9); 
            border-radius: 8px; 
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1); 
        }

        th, td {
            padding: 15px; 
            text-align: left;
            border-bottom: 1px solid #ddd; 
        }

        th {
            background-color: #4CAF50; 
            color: white; 
        }

        input[type="text"],
        textarea,
        select {
            width: 95%; 
            padding: 12px; 
            margin: 10px auto; 
            border: 1px solid #ccc;
            border-radius: 4px;
            display: block; 
            font-size: 16px; /* Increased font size for better readability */
        }

        /* Adjust dropdown specifically */
        select {
            background-color: white; 
            appearance: none; 
            -moz-appearance: none; 
            -webkit-appearance: none; 
            background-image: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 20 20"><polygon points="0,0 20,0 10,10" fill="gray"/></svg>'); 
            background-repeat: no-repeat;
            background-position: right 10px center; 
            background-size: 12px; 
        }

        .button-container {
            text-align: center; 
            margin-top: 20px; 
        }

        input[type="submit"],
        input[type="reset"],
        input[type="button"] {
            width: 30%; 
            background-color: #4CAF50;
            color: white;
            padding: 12px 20px; 
            border: none;
            border-radius: 4px;
            cursor: pointer;
            margin: 5px; 
            display: inline-block; 
            font-size: 18px; /* Increased font size for better readability */
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
            var name = document.forms["f1"]["name"].value;
            var feedback = document.forms["f1"]["feedback"].value;
            
            if (book == "" || name == "" || feedback == "") {
                alert("Please check all fields");
                return false; // Prevent form submission
            } else {
                alert("Feedback Added Successfully");
                return true; // Allow form submission
            }
        }
    </script>
</head>
<body id="addd">
    <div id="title">
        <h1>ONLINE BOOK FEEDBACK SUBMISSION</h1>
        <p>Thoughtful reviews can help books gain visibility in a crowded market.</p>
    </div>
    
    <form method="post" name="f1" onsubmit="return Disp()">
        <h2>ADD FEEDBACK</h2>
        <%
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/feedback", "root", "");
            Statement statement = con.createStatement();
            ResultSet resultset = statement.executeQuery("select * from addtrend");
        %>
        <table>
            <tr>
                <th>Book:</th>                
                <td>
                    <select name="book"> 
                        <% while (resultset.next()) { %>
                        <option><%= resultset.getString(1) %></option>
                        <% } %>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Name:</th>
                <td><input type="text" id="name" name="name" /></td>
            </tr>
            <tr>
                <th>Feedback:</th>
                <td><textarea id="feedback" name="feedback" rows="9"></textarea></td>
            </tr>
        </table>
        
        <%
            try {
                String book = request.getParameter("book");
                String name = request.getParameter("name");
                String feedback = request.getParameter("feedback");
                
                if (!book.equals("") && !name.equals("") && !feedback.equals("")) {
                    PreparedStatement pt = con.prepareStatement("insert into addfeedback values(?,?,?)"); 
                    pt.setString(1, book);
                    pt.setString(2, name);
                    pt.setString(3, feedback);
                    pt.executeUpdate();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        %>
        <div class="button-container">
            <input type="submit" value="Submit" />
            <input type="button" onclick="window.location.href='visitor_viewtrendbook.jsp'" value="Back">
        </div>
    </form>
</body>
</html>
