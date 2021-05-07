package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doService(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doService(req, resp);
	}
	
	protected void doService(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		
		if (userName.equals("nirajthagunna") && password.equals("admin")) {
			req.getRequestDispatcher("link.html").include(req, resp);
			out.println("<hr />");
			
			out.println("<h3>You are successfully logged in!!!</h3>");
			out.println("Welcome, " + userName);
			
			// Creating a HttpSession object
			HttpSession session = req.getSession();
			
			// Setting attributes
			session.setAttribute("user_name", userName);
		}
		else {
			out.println("<h3>Sorry, username and password didn't match!!!</h3>");
			out.println("<hr />");
			req.getRequestDispatcher("login.html").include(req, resp);
		}
		
		out.close();
		
	}

}
