<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- Error : Exception Page -->
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exceptions...</title>

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
		color: white;
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
		<div id="top">Exception</div>
		
		<h3>Sorry...!!!Something went to wrong!!!</h3>
		
		<p id="error"><b>Error : <%= exception %></b></p>
		<a href="/SmartErrorHandling" id="link">Home Page</a>
	</div>

</body>
</html>