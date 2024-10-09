

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login Page</title>
        <link rel="stylesheet" href="ss.css" type="text/css"/>
        <style>
    body {
         background-image: url("img/im1.jpg");
        background-color: e7feff;
        font-family: 'Times New Roman',Times,serif;
        text-align: center;
    }

    
    #login {
        background-color: #CCCCFF;
        width: 400px;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    }

    #login h2 {
        font-size: 23px;
        margin-bottom: 20px;
    }

    #login img {
        width: 200px;
        height: auto;
        margin-bottom: 20px;
    }

    #login label {
        font-weight: bold;
    }

    #login input[type="name"],
    #login input[type="password"],
    #login input[type="submit"],
    #login input[type="reset"],
    #login input[type="usher"]{
        width: calc(100% - 20px);
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    #login input[type="submit"],
    #login input[type="reset"],
    #login input[type="usher"] {
        background-color: #4CAF50;
        color: white;
        border: none;
        cursor: pointer;
    }

    #login input[type="submit"]:hover,
    #login input[type="reset"]:hover,
    #login input[type="usher"]:hover{
        background-color: #45a049;
    }

    ul {
        list-style-type: none;
        margin: 0;
        padding: 0;
    }

    ul li {
        margin-top: 10px;
    }

    ul li a {
        text-decoration: none;
        color: #555;
    }

    ul li a:hover {
        color: #000;
    }
</style>

    </head>
    <body>
    <center>
         <div id="title">
            <h2>ONLINE BOOK FEEDBACK SUBMISSION</h2>
            <p> The Key To Learning Is Feedback. It's Nearly Impossible To Learn Anything Without It.
</p>
        </div>
        <div id="ima">
            <div id="login">
            <form method="post">
                <h2>Admin Login Page</h2>
                <img src="img/book5.jpg" alt="Image Loading"/><br>
              
                <label><b>Username: </b></label>
                        
                   <input type="name" name="name" value=""/>
                            <br><br>
                            <label><b>Password : </b></label>
                        <input type="password" name="pass" value=""/><br>
                        <%
                            try{
                                Class.forName("com.mysql.cj.jdbc.Driver");
                                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/feedback","root","");
                                System.out.print("success");
                                Statement st=con.createStatement();
                                 String name=request.getParameter("name");
                                 String pass=request.getParameter("pass");
                                 int c=0;
                                 ResultSet rs=st.executeQuery("select * from adminreg");
                                 while(rs.next())
                                     {
                                         if(name.equals(rs.getString(1)) && pass.equals(rs.getString(2)))
                                             {
                                                 c=1;
                                                 }
                                         if(c==1){
                                                
                                             System.out.print("success");
                                             %>
                                             <script>
                                                 Disp();
                                             </script>
                                             <%response.sendRedirect("adminpage.jsp");}
                                                 else{
                                                 
                                                 System.out.print("no");
                                             %>
                                             <script>
                                                 Disp1();
                                             </script>
                               <%}
                                         }
                            }
                             catch(Exception e){}
                            %>
                        
                 <ul>
                 <input type="submit" value="Submit" style="font-family: times new roman; font-size: 18px; "/></a>
                
                 <br>
                </ul>
                              <input type="reset" value="Reset" style="font-family: times new roman; font-size: 18px;"/>
                 <br>
                
                <ul>
                <li><a href="adminreg.jsp">Click here to Make Your Connection </a>
                </li>
                </ul>
            </form>
        </div>
        </div>
    </center>
                
    </body>
</html>
