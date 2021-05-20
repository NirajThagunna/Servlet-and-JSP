<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div id="carouselExampleDark" class="carousel carousel-dark slide"
	data-bs-ride="carousel">
	<div class="carousel-indicators">
		<button type="button" data-bs-target="#carouselExampleDark"
			data-bs-slide-to="0" class="active" aria-current="true"
			aria-label="Slide 1"></button>
		<button type="button" data-bs-target="#carouselExampleDark"
			data-bs-slide-to="1" aria-label="Slide 2"></button>
		<button type="button" data-bs-target="#carouselExampleDark"
			data-bs-slide-to="2" aria-label="Slide 3"></button>
		<button type="button" data-bs-target="#carouselExampleDark"
			data-bs-slide-to="3" aria-label="Slide 4"></button>
	</div>
	<div class="carousel-inner">
		<div class="carousel-item active" data-bs-interval="10000">
		<c:url var="img1" value="/images/first.jpg"></c:url>
		<c:set var="img2" value="Niraj"></c:set>
			<img class="bodyImage"
				src="<c:url value="${img1}"/>"
				class="d-block w-100" alt="...">
				<h1><c:out value="${img2}"/></h1>
				<c:set var = "salary" scope = "session" value = "${2000*2}"/>
      <c:out value = "${salary}"/>
			<div class="carousel-caption d-none d-md-block">
				<h5 class="text-white"
					style="text-shadow: 3px 3px 5px #FF0000, 0 3px 5px #0000FF;">Welcome
					to Airline Reservation System</h5>
			</div>
		</div>
		<div class="carousel-item" data-bs-interval="2000">
			<img class="bodyImage"
				src="second.jpg"
				class="d-block w-100" alt="...">
			<div class="carousel-caption d-none d-md-block">
				<h5>Book Ticket</h5>
			</div>
		</div>
		<div class="carousel-item">
			<img class="bodyImage"
				src="third.jpg"
				class="d-block w-100" alt="...">
			<div class="carousel-caption d-none d-md-block">
				<h5>Make a World Tour</h5>
			</div>
		</div>
		<div class="carousel-item">
			<img class="bodyImage"
				src="fourth.jpg"
				class="d-block w-100" alt="...">
			<div class="carousel-caption d-none d-md-block">
				<h5 class="text-white">Enjoy your life by traveling</h5>
			</div>
		</div>
	</div>
	<button class="carousel-control-prev" type="button"
		data-bs-target="#carouselExampleDark" data-bs-slide="prev">
		<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="visually-hidden">Previous</span>
	</button>
	<button class="carousel-control-next" type="button"
		data-bs-target="#carouselExampleDark" data-bs-slide="next">
		<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="visually-hidden">Next</span>
	</button>
</div>