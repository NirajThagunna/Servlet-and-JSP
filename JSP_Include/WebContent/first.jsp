<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%

String name = request.getParameter("name");

%>


<h2>The name of the Engineer who developed this is : <%= name %></h2>