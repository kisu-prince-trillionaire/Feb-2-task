<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<body>
	<%
	String msg = (String) request.getAttribute("msg");
	%>
	<h4><%=msg%></h4>
</body>
</html>
