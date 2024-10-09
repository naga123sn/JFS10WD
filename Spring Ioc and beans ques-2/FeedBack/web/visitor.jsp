<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Visitor Login Page</title>
        <style>
            body {
                background-image: url("img/book6.jpg");
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
                width: 45%; /* Width for buttons */
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
        <script language="javascript">
            function Disp() {
                alert("Login Successfully");
            }
            function Disp1() {
                alert("Username or password is mismatch");
            }
        </script>
    </head>
    <body>
        <div id="title">
            <h1>ONLINE BOOK FEEDBACK SUBMISSION</h1>
            <p>Feedback is a free education to excellence. Seek it with sincerity and receive it with grace!</p>
        </div>
        
        <div id="login">
            <form method="post">
                <h2>Visitor Login</h2>
                <img src="img/im10.jpg" alt="Image Loading"/><br>
                <label><b>Username:</b></label>
                <input type="text" name="user" required/>
                
                <label><b>Password:</b></label>
                <input type="password" name="pass" required/>
                
                <%
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/feedback", "root", "");
                        Statement st = con.createStatement();
                        String name = request.getParameter("user");
                        String pass = request.getParameter("pass");
                        int c = 0;
                        ResultSet rs = st.executeQuery("select * from visitorreg");
                        while (rs.next()) {
                            if (name.equals(rs.getString(2)) && pass.equals(rs.getString(3))) {
                                c = 1;
                            }
                        }
                        if (c == 1) {
                            %>
                            <script>Disp();</script>
                            <%
                            response.sendRedirect("visitor_viewtrendbook.jsp");
                        } else {
                            %>
                            <script>Disp1();</script>
                            <%
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                %>
                
                <input type="submit" value="Submit"/>
                <input type="reset" value="Reset"/>
                <ul>
                    <li><a href="visitorreg.jsp">Click here to Make Your Connection!</a></li>
                </ul>
            </form>
        </div>
    </body>
</html>
