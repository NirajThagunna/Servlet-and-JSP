<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP:Bean attributes</title>
</head>
<body>

	<h1>Using JavaBeans in JSP</h1>
	
	<!-- Using the bean - Loading the bean class -->
	<jsp:useBean id="beanObj" class="com.bean.TestBean"/>
	
	<jsp:setProperty name="beanObj" property="message" value="Hello JSP..."/>
	<p><b>Got message...</b></p>
	
	<jsp:getProperty name="beanObj" property="message"/>

</body>
</html>