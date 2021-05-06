package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Logout Servlet

public class LogoutServlet extends HttpServlet {

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
		
		// Getting the cookies
		Cookie[] cookies = request.getCookies();

		if (cookies != null) {
			// to delete cookie. It is mainly used to logout or signout the user.
			// Deleting the value of cookie
			Cookie ck = new Cookie("username", "");
			// Changing the Maximum age to 0 second.
			ck.setMaxAge(0);
			// Adding the cookie in the response
			response.addCookie(ck);
			
			out.println("<h3>You have successfully logged out!!!</h3>");
		}
		else {
			out.println("<h2>You haven't logged in yet, please login first...</h2>");
			request.getRequestDispatcher("login.html").include(request, response);
		}

		out.close();
	}

}
