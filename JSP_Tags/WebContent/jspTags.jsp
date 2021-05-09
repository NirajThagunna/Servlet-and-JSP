<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Tags</title>
</head>
<body>

	<h1>JSP Tags</h1>

	<!-- JSP Declaration/Declarative Tag -- for variables and methods -->

	<!-- The JSP Declaration tag is used to declare the fields and methods.
		The code for it, placed outside the service() method of auto generated servlet.
		So, it doesn't get the memory at each request. -->

	<%!
	
	int a = 10;
	int b = 20;

	String name = "Niraj Thagunna";

	public int doSum() {
		return a + b;
	}

	public String reverse() {
		StringBuffer sb = new StringBuffer(name);
		return sb.reverse().toString();
	}
	
	%>
	
	<!-- Scriptlet tag - Java code can be written inside the jsp page using scriptlet tag -->
	<!-- inside the service() method of the auto generated servlet -->
	<!-- you can declare the variables inside the scriptlet tag but you can not declare the methods -->
	<!-- It is used to execute the Java source code in the JSP page -->
	<!-- Java Source Code -->
	<!-- Processing logic can be written inside the scriptlet tag -->
	
	<%
	
	out.println(a);
	out.println("<br />");
	out.println(name);
	out.println("<br />");
	out.println(reverse());
	
	%>
	
	<!-- JSP Expression Tag - to write to the output stream of the response.
		 It is mainly used to print the values of the variables and methods.
		 Note: Do not end your statement with the semicolon in case of the expression tag -->
		 
	<h2>Name : <%= name %></h2>
	<p>Sum is : <%= doSum() %></p>

</body>
</html>



