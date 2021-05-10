<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP:Include</title>
</head>
<body>

	<h2>JSP:Include Action Tag</h2>
	
	<!-- Includes the resource at the request time -->
	<!-- better for the dynamic pages -->
	
	<jsp:include page="first.jsp">
		<jsp:param name="name" value="Er. Niraj Thagunna"/>
	</jsp:include>

</body>
</html>