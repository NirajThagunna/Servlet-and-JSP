package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

// first servlet which fetch the data from the user form

public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}
	
	// service method
	public void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// generating the response
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// get the form data
		String name = request.getParameter("name");
		
		out.println("<h1>Hello, " + name + " Welcome to Cookies</h1>");
		out.println("<h2><a href='secondServlet'>Go to the Second Servlet</a></h2>");
		
		// creating the Cookies
		// An invalid character [32] was present in the Cookie value i.e. space character is not allowed.
		Cookie cookie = new Cookie("user_name", name);
		
		// Adding the cookie with the response
		response.addCookie(cookie); // passing the cookie object
		
		out.close();
	}
}






