<%-- 
    Document   : Register
    Created on : Oct 21, 2022, 12:29:53 PM
    Author     : CMP
--%>

<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Connection con;
Statement stmt;
Statement stmt1;
String tollgatename;
String location; 
String address;
String country;
String mobile;
String noofstaff;%>

<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Edit Staff List</title>
</head>
 <script>
function back_funct(){
   
<% String name3 = (String) request.getParameter("name");
   System.out.println("jsname:"+name3);%>
           var name = '<%=name3%>';
//window.open("Register.jsp");
window.open("http://localhost:8080/bus/admin.jsp?name="+name);
//var name = "roseindia";
//window.location.replace("a.jsp?name="+name);
}
function editcoffee(){
   
   
//window.open("Register.jsp");
coffee_id=document.getElementById('edit').value;
alert(coffee_id);
window.open("http://localhost:8080/bus/editdoctor.jsp?id="+coffee_id);
//var name = "roseindia";
//window.location.replace("a.jsp?name="+name);
}

function deletecoffee(){
    coffee_id=document.getElementById('delete').value;

 var doIt=confirm('Do you want to delete the record?');
  if(doIt){
    
   window.open("http://localhost:8080/bus/deletedoctor?id="+coffee_id);
    }
  else{

    }
   
//window.open("Register.jsp");
//coffee_id=document.getElementById('delete').value;
//alert(coffee_id);
//window.open("http://localhost:8080/CoffeeShop/editcoffee.jsp?id="+coffee_id);
//var name = "roseindia";
//window.location.replace("a.jsp?name="+name);
}
</script>
<style>
           .first{
    background-color:black;
    color:white;
}
body .dashboards{
    background-size:cover;
     background-repeat:no-repeat;
     background-attachment:fixed;
     margin:0px;
     padding:0px;
}
.fleft{
    float:left !important;
    margin-top:10px;
    margin-left:10px;
}
.fright{
    float:right !important;
    text-align:right;
    margin: 10px 30px;
    display:inline-block; 
    border-radius: 2px;
   font-weight: bold;
   text-transform: uppercase;
     outline:0px;
        border:none;
     
}
f-item{
    display:block;
    border:none;
    outline:0px;
}
.topnav-name{
    position:relative;
}
.centered {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  color:black;
  text-transform: uppercase;
 font-size:22px;
 color:black;
}
 button{
    border:none;
    color:white;
    padding:10px 30px;
    text-align:center;
    text-decoration:none;
    display:inline-block;
    font-size:16px;
    margin:4px 2px;
    cursor:pointer;
    background-color:black;
    border-radius:10px;

}
#edit{
    
    border:none;
    color:white;
    padding:10px 30px;
    text-align:center;
    text-decoration:none;
    display:inline-block;
    font-size:16px;
    margin:4px 2px;
    cursor:pointer;
    background-color:green;
    border-radius:10px;


}
#delete{
    
    border:none;
    color:white;
    padding:10px 30px;
    text-align:center;
    text-decoration:none;
    display:inline-block;
    font-size:16px;
    margin:4px 2px;
    cursor:pointer;
    background-color:red;
    border-radius:10px;


}

</style>
<body>
     <%
    String name2 = (String) request.getAttribute("name");
     System.out.println("attribute"+name2);
     if(name2==null){
      name2 = request.getParameter("name");
    }

 /*   if(name2.isEmpty()){
      name2 = request.getParameter("name");
    }*/
   
     %>
          
    <div class="first" style="width:100%;height:45px;">
      <h2 class="fleft topnav-name" title="name" style="padding-right:10px !important;passing-left:10px !important;">ONLINE BUS TICKET BOOKING SYSTEM</h2>
        <a class="fright f-item " href="http://localhost:8080/bus/index.jsp" target="_blank" title="login" style="padding-right:10px !important; padding-left:10px !important; color:white;"> Logout </a>
    
                 </div>
   <div class="container1" style="width:100%;height:80%;position:absolute;">
                 
                   <table border="1" style="height:50px;width: 1000px;">
                       <br>
                        <h1 style='color:black;'>USER LIST</h1>
                        <br>
                        <tr>
                           
                             <th style="height: auto;width:100px;"> Id</th>
                             <th style="height: auto;width:100px;">Driver name</th>
                                <th style="height: auto;width:100px;">Phone number </th>
                              <th style="height: auto;width:100px;">Bus no</th>
                               <th style="height: auto;width:100px;">Type</th>
                              <th style="height: auto;width:100px;">Date</th>
                              <th style="height: auto;width:100px;">From</th>
                              <th style="height: auto;width:100px;">To</th>
                              
                              <th style="height: auto;width:100px;">Total Seat</th>
                              <th style="height: auto;width:100px;">Booked Seat</th>
                               <th>Amount/Seat</th>
                                
                                   
                            
    
                        </tr>
                      
                        <%  try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                
                    System.out.println("list:"+name2);
                       System.out.println("Driver Start");
                       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking", "root", "");
                      System.out.println("Getconnection Start");
                       stmt = con.createStatement();
                        stmt1 = con.createStatement();
                         String sql="select * from add_bus";
                       System.out.println(sql);
                       ResultSet rs=stmt.executeQuery(sql);
                        while (rs.next()) { int id=rs.getInt(1);%>
                        <tr>
                           
                     <td style="height: 50px;width:70px;"> <% out.println(rs.getString(1)); %> </td>
                     <td><% out.println(rs.getString(2)); %></td> 
                          <td><% out.println(rs.getString(3)); %></td>    
                     
                         <td><% out.println(rs.getString(5)); %></td>
                          <td><% out.println(rs.getString(6)); %></td> 
                          <td><% out.println(rs.getString(7)); %></td> 
                          <td><% out.println(rs.getString(12)); %></td> 
                           <td><% out.println(rs.getString(13)); %></td> 
                          <td><% out.println(rs.getString(8)); %></td> 
                             <td><% out.println(rs.getString(10)); %></td> 
                             <td><% out.println(rs.getString(11)); %></td> 
                            
                          
                      
                        
                       
                        </tr>
                        <%  

                      } String sqll="select * from user_register";
                       System.out.println(sql);
                       ResultSet rss=stmt.executeQuery(sqll);
                        while (rss.next()) { int id=rs.getInt(1);%>
                        <tr>
                           
                     <td style="height: 50px;width:70px;"> <% out.println(rss.getString(1)); %> </td>
                     <td><% out.println(rs.getString(2)); %></td> 
                            
                     
                         <td><% out.println(rs.getString(5)); %></td>
                        
                         
                            
                            
                            
                          
                      
                        
                       
                        </tr>
                        <%  

                      }

                        }
                            catch(Exception e){
                               System.out.println(e);
                        }
                   
                    %>
                 
       <tr>
          <button id="back" onclick="back_funct()">Back</button>
      </tr>
            </table>
   </div>
                    

 <script type="text/javascript" src="js/fileselection.js"></script>

       <script>
         function msgfunction(){ </script>
  <%
      
   String sAction = (String) request.getAttribute("alertMsg"); %> 
    <% if(sAction=="In Progress, Not yet decide"){ %>
    <script>
        alert("In Progress, Not yet decide");
        
        </script><% } 
     String aSuccess=  (String) request.getAttribute("alertMsg"); 
        String name=  (String) request.getAttribute("name");%> 
    <% if(aSuccess=="Doctor Details Updated Successfully"){ %>
    <script>
        alert("Doctor Details Updated Successfully");
        
        </script><% }
 String aSuccess1=  (String) request.getAttribute("alertMsg"); %> 
    <% if(aSuccess=="Doctor Details Deleted Successfully"){ %>
    <script>
        alert("Doctor Details Deleted Successfully");
        
        </script><% }%>
<script> }</script>
  
</body>


</html>


