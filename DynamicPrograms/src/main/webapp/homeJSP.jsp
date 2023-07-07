<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./style.css">
</head>
<body>
<div class="homePage">
<div class="container">
<h1>Home page</h1>
<%
String name=(String) session.getAttribute("username");
%>
<h1>Welcome <%=name %></h1>
<a href="logoutServlet">Logout</a></div>
</div>
</body>
</html>