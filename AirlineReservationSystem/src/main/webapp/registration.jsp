<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up | Login</title>

<!-- Bootstrap CDN -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">

<!-- fontawesome icons -->
<link rel="stylesheet"
	href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
	integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
	crossorigin="anonymous" />

<!-- jQuery CDN -->
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Custom CSS -->
<style><%@ include file="css/style.css" %></style>
<style><%@ include file="css/registrationStyle.css" %></style>

</head>
<body style="background-image: url(first.jpg);">


	<!-- header section -->
	<div id="header">
		<%@ include file="header.jsp"%>
	</div>


	<!-- Sign Up and Login Page -->
	<div class="login-reg-panel">
		<div class="login-info-box">
			<h2 class="text-white">Have an account?</h2>
			<label id="label-register" for="log-reg-show" class="text-white">Login</label>
			<input type="radio" name="active-log-panel" id="log-reg-show"
				checked="checked">
		</div>

		<div class="register-info-box">
			<h2 class="text-white">Don't have an account?</h2>
			<label id="label-login" for="log-login-show" class="text-white">Sign
				Up</label> <input type="radio" name="active-log-panel" id="log-login-show">
		</div>

		<div class="white-panel">
			<div class="login-show">
				<h2>LogIn</h2>
				<form action="loginServlet" method="post">
					<input type="text" placeholder="Username"> <input
						type="password" placeholder="Password"> <input
						type="submit" value="Login">
				</form>
			</div>
			<div class="register-show">
				<h2>Create an Account</h2>
				<form action="signUpServlet" method="post">
					<input type="text" name="user_name" placeholder="Username">
					<input type="email" name="email" placeholder="Email"> <input
						type="password" name="password" placeholder="Password"> <input
						type="password" name="confirm_pass" placeholder="Confirm Password">
					<input type="submit" value="Sign Up">
				</form>
			</div>
		</div>
	</div>

	<!-- Footer goes here -->
	<div id="footer">
		<%@ include file="footer.jsp"%>
	</div>

	<!-- JavaScript Code -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>

	<script type="text/javascript"><%@ include file="js/registrationScript.js" %></script>

</body>
</html>