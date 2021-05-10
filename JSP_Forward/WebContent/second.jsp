<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forwarded Page</title>
</head>
<body>

	<h2>Forwarded Page</h2>
	
	<h2>The developer name is : 
	
	<%
	String name = request.getParameter("name");
	%>
	
	<%= name %>
	
	</h2>

</body>
</html>