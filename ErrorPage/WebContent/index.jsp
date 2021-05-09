<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- Calling the error page when an error comes -->
<%@ page errorPage="errorJsp.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Handling in JSP</title>
</head>
<body>

	<h1>Error handling</h1>
	
	<%!
	int a = 100;
	int b = 0;
	
	String name = null;
	%>
	
	<%
	int division = a / b;
	%>
	
	<h2>Division is : <%= division %></h2>

</body>
</html>










