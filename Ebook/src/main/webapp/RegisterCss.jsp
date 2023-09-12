<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
    <%@ page import="java.sql.*" %>
    <%@ page import="com.servlet.java.JDBConnection" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="Welcome.jsp"/>

<table border="1">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>UserName</th>
<th>Password</th>
<th>Address</th>
<th>ContactNo</th>
</tr>
<% 
String fname="";
String lname="";
String uname="";
String pword="";
String address="";
String cno="";

Connection con=JDBConnection.getConnection();
String qry="select*from registerpage";
Statement st=con.createStatement();
ResultSet rs;
rs=st.executeQuery(qry);

while(rs.next())
{
 //fname=rs.getString("Firstname");
 //lname=rs.getString("Lastname");
 //uname=rs.getString("Usertname");
 //pword=rs.getString("Password");
 //address=rs.getString("Address");
//cno=rs.getString("ContactNo");



%>

<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getString(6)%></td>
</tr>


<%} %>
</table>
</body>
<style>
body
{
background-color:#FFC0CB;
}
th
{
background-color:blue;
}
th,td
{
width:100px;
}
w2
td{
background-color:grey;
}

</style>
</html>