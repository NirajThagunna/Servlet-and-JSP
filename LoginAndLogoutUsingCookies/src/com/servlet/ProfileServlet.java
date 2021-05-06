package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Profile Servlet
public class ProfileServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}
	
	
	public void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		out.println("<hr />");
		
		// getting the Cookies
		Cookie[] cookies = request.getCookies();
		
		if (cookies != null) {
			
			String username = cookies[0].getValue();
			
			if (!username.equals("") && username != null) {
				out.println("<h4>Welcome to your profile!</h4>");
				out.println("Welcome, " + username + " to your world!!!");
			}
		}
		else {
			out.println("<h2>Please login first</h2>");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		
		out.close();
	}
}







