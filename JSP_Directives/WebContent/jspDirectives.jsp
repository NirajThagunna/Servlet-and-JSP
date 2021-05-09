<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- page directives -->
<%@ page import="java.util.Random, java.io.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Directives</title>
</head>
<body>

	<!-- include directives - include the content of the header.html file into this page -->
	<%@ include file="header.jsp" %>
	
	<h2> Random number is : 
	
	<%
	
	Random rand = new Random();
	int num = rand.nextInt(10); // generate the random number between 0 to 9 i.e. 10 random number
	
	%>
	
	<%= num %>
	
	</h2>

</body>
</html>