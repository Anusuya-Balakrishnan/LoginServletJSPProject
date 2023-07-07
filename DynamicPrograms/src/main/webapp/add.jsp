<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello world</h1>
<%
int a=10;
int b=20;
int c=a+b;
RequestDispatcher rd=request.getRequestDispatcher("");
rd.forward(request, response);
%>
<h1>The result= <%= c+b%></h1>
</body>
</html>