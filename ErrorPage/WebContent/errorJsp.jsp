<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- Making this page as error page -->
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sorry...!!!</title>

<style>
	
	#error {
		border: 1px solid red;
		margin: 20px;
		padding: 20px;
		background: black;
		color: white;
		font-size: 30px;
	}

</style>

</head>
<body>

	<div style="background: green; color: black; padding: 20px">
		<h2>Sorry...Something went to wrong!!!</h2>
		<p id="error">Error : <%= exception %></p>
	</div>

</body>
</html>