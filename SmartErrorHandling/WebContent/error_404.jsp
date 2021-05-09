<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- Error : Exception Page -->
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>404 Not Found</title>

<style>
	.container {
		border: 1px solid red;
		margin: 20px;
		padding: 20px;
	}
	
	#top {
		border: 1px solid black;
		width: 100px;
		height: auto;
		margin: 5px;
		padding: 10px;
		background: black;
		color: red;
	}
	
	#link {
		border: 1px solid black;
		width: 100px;
		height: auto;
		margin: 8px;
		padding: 8px;
		background: black;
		color: white;
		text-decoration: none;
	}
	
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

	<div class="container">
		<div id="top">404 Not Found</div>
		
		<h3 id="error">Sorry...!!! Page Not Found!!!</h3>
		
		<a href="/SmartErrorHandling" id="link">Home Page</a>
	</div>

</body>
</html>