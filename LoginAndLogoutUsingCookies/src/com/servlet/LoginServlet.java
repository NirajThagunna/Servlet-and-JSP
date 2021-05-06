package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Login Servlet

public class LoginServlet extends HttpServlet{

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

		//		out.println("<a href='logoutServlet'><button>Logout</button></a>\t<a href='profileServlet'><button>Profile</button></a>");

		//		out.println("<hr />");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.equals("nirajthagunna") && password.equals("niraj123")) {

			request.getRequestDispatcher("link.html").include(request, response);

			out.println("<hr />");

			out.println("<h2>You have successfully logged in!!!</h2>");
			out.println("<h4>Welcome, " + username + " </h4>");

			Cookie ck = new Cookie("username", username);

			// Adding the cookies in the response
			response.addCookie(ck);
		}
		else {
			
			request.getRequestDispatcher("link.html").include(request, response);

			out.println("<hr />");
			out.println("Sorry, username and password are incorrect!!!");
			request.getRequestDispatcher("login.html").include(request, response);
		}

		out.close();
	}

}
