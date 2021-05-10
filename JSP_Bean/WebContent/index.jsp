<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP:useBean</title>
</head>
<body>

	<h2>JSP:useBean action tag</h2>
	<p>The jsp:useBean action tag is used to locate or instantiate a bean class</p>
	
	<jsp:useBean id="obj" scope="page" class="com.beanClass.Calculator" type="com.beanClass.Calculator"/>
	
	<%
	int m = obj.cube(5);
	out.println("Cube of 5 is : " + m);
	%>

</body>
</html>