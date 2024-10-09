<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Admin Register Page</title>
    <link rel="stylesheet" href="ss.css" type="text/css"/>
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

    <script language="javascript">
        function Disp() {
            var name = document.forms["f1"]["name"].value;
            var user = document.forms["f1"]["user"].value;
            var pass = document.forms["f1"]["pass"].value;
            var email = document.forms["f1"]["email"].value;
            var phone = document.forms["f1"]["phone"].value;

            if (name == "" || user == "" || pass == "" || email == "" || phone == "") {
                alert("Please fill all fields.");
                return false; // Prevent form submission
            } else {
                alert("Registered Successfully");
                return true; // Allow form submission
            }
        }
    </script>
</head>
<body id="Admin">
    <div id="title">
        <h2>ONLINE BOOK FEEDBACK SUBMISSION</h2>
        <p>To Create Platform For Best Managing Of Online Book Reading With Visitor Feedback</p>
    </div>
    <div id="Admin_reg">
        <form method="post" name="f1" onsubmit="return Disp()">
            <h2>ADMIN REGISTRATION</h2>
            <table>
                <tr>
                    <th>Name</th>
                    <td><input type="text" id="name" name="name" /></td>
                </tr>
                <tr>
                    <th>User Name</th>
                    <td><input type="text" id="user" name="user" /></td>
                </tr>
                <tr>
                    <th>Password</th>
                    <td><input type="password" id="pass" name="pass" /></td>
                </tr>
                <tr>
                    <th>Email</th>
                    <td><input type="text" id="email" name="email" /></td>
                </tr>
                <tr>
                    <th>Phone No</th>
                    <td><input type="text" id="phone" name="phone" /></td>
                </tr>
            </table>
             <%
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/feedback", "root", "");
                    String name = request.getParameter("name");
                    String user = request.getParameter("user");
                    String pass = request.getParameter("pass");
                    String email = request.getParameter("email");
                    String phone = request.getParameter("phone");

                    PreparedStatement pt = con.prepareStatement("INSERT INTO adminreg VALUES(?,?,?,?,?)");
                    pt.setString(1, name);
                    pt.setString(2, user);
                    pt.setString(3, pass);
                    pt.setString(4, email);
                    pt.setString(5, phone);

                    pt.executeUpdate();
                } catch (Exception e) {
                    System.out.println(e);
                }
            %>
            <div class="button-container">
                <input type="submit" value="Submit" />
                <input type="reset" value="Reset" />
                <input type="button" onclick="window.location.href='admin.jsp'" value="Back" />
            </div>
        </form>
    </div>
</body>
</html>
