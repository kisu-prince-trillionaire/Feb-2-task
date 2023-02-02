<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Logged In sucessfully</h1>
	<%
	String msg = (String) request.getAttribute("msg");
	%>
	<h4><%=msg %></h4>
</body>
</html>
