package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {

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
		
		req.getRequestDispatcher("link.html").include(req, resp);
		out.println("<hr />");

		// getting the session object
		HttpSession session = req.getSession(false);
		
		if (session != null) {
			
			session.invalidate(); // Invalidates this session then unbinds any objects bound to it.
			
			out.println("<h4>You have logged out successfully!!!</h4>");
		}
		else {
			out.println("<h2>Please login first!</h2>");
			req.getRequestDispatcher("login.html").include(req, resp);
		}

		out.close();

	}

}
