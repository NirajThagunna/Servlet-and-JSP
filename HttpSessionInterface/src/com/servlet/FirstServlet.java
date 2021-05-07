package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {

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

		String name = req.getParameter("user_name");

		out.println("<h2>Welcome, " + name + "</h2>");
		
		// Creating a new session
		// HttpSession - Interface
		HttpSession session = req.getSession();
		
		// setting the value using the setAttribute() method
		session.setAttribute("uname", name);
		
		// link to go to the second servlet
		out.println("<a href='secondServlet'>Go to the second servlet</a>");

		out.close();
	}

}




