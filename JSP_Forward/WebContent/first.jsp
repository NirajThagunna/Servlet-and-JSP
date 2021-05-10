<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP:Forward Tag</title>
</head>
<body>

	<!-- You can pass the parameter with the jsp:forward action tag -->
	<jsp:forward page="second.jsp">
		<jsp:param name="name" value="Niraj Thagunna"/>
	</jsp:forward>

</body>
</html>