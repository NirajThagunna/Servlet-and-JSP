<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loss</title>
</head>
<body>

	<h2>JSTL</h2>
	<c:set var="salary" scope="session" value="${2000*2}" />
	<c:out value="${salary}" />

</body>
</html>