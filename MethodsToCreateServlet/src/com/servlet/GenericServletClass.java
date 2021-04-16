package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// Creating the servlet by inheriting GenericServlet class
public class GenericServletClass extends GenericServlet {
	
	private static final long serialVersionUID = 1L;

	// service method
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		System.out.println("Providing the service in GenericServlet Class.");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1>Creating the servlet by inheriting the GenericServlet class.");
		
		out.close();
	}
	
}
