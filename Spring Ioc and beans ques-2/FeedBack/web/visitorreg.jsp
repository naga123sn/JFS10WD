<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Visitor Registration Page</title>
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

        #Visitor_reg {
            background-color: #fff;
            width: 450px;
            margin: 50px auto;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            text-align: left;
        }

        #Visitor_reg h2 {
            font-size: 20px;
            margin-bottom: 20px;
            text-align: center;
        }

        table {
            width: 100%;
            margin: 0 auto;
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
            display: block;
            margin: 0 auto;
        }

        .button-container {
            text-align: center;
            margin-top: 20px;
        }

        input[type="submit"],
        input[type="reset"],
        input[type="button"] {
            width: auto;
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            margin: 5px;
            display: inline-block;
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
            if (name === "" || user === "" || pass === "" || email === "" || phone === "") {
                alert("Please check all fields");
                return false; // Prevent form submission
            } else {
                alert("Registered Successfully");
                return true; // Allow form submission
            }
        }
    </script>
</head>
<body id="adim">
    <div id="title">
        <h1>ONLINE BOOK FEEDBACK SUBMISSION</h1>
        <p>Every Failure is Just Feedback On The Way To Success</p>
    </div>
    <div id="Visitor_reg">
        <form method="post" name="f1" onsubmit="return Disp()">
            <h2>VISITOR REGISTRATION</h2>
            <table>
                <tr>
                    <th>Name</th>
                    <td><input type="text" id="Name" name="name" value=""/></td>
                </tr>
                <tr>
                    <th>User Name</th>
                    <td><input type="text" id="User" name="user" value=""/></td>
                </tr>
                <tr>
                    <th>Password</th>
                    <td><input type="password" id="pass" name="pass" value=""/></td>
                </tr>
                <tr>
                    <th>Email</th>
                    <td><input type="text" id="email" name="email" value=""/></td>
                </tr>
                <tr>
                    <th>Phone No</th>
                    <td><input type="text" id="phone" name="phone" value=""/></td>
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

                    PreparedStatement pt = con.prepareStatement("INSERT INTO visitorreg VALUES(?,?,?,?,?)");
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
                <input type="submit" value="Submit"/>
                <input type="reset" value="Reset"/>
                <input type="button" onclick="window.location.href='visitor.jsp'" value="Back">
            </div>
        </form>
    </div>
</body>
</html>
