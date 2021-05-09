package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextClass extends HttpServlet {

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

		// getting an object of the ServletContext interface
		ServletContext context = getServletContext();

		// getting the value of context-param
		String userName = context.getInitParameter("username");

		// Setting the attributes to the context object
		context.setAttribute("pass", "niraj123");

		out.println("<h2>Welcome, " + userName + "</h2>");

		out.println("<a href='thirdServlet'>Third Servlet</a>");

		out.close();

	}

}
