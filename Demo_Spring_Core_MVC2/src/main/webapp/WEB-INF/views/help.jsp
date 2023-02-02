<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Welcome to help section</h1>
	<%
	String name = (String) request.getAttribute("name");
	%>
	
	<h3>
	Hello My name is <%=name %>
	</h3>
</body>
</html>