<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page errorPage="exception_jsp.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Processing</title>
</head>
<body>

	<!-- getting the input values -->
	<%
	
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	
	int division = num1 / num2;
	
	%>
	
	<h2>Result is : <%= division %></h2>

</body>
</html>

