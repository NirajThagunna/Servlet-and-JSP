package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {

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

		// getting the url parameter 
		// getting the value from the query string
//		String name = req.getParameter("name");
//		
//		out.println("<h2>Hello, " + name + ", welcome to the second servlet!</h2>");
		
		// getting the hidden form field value
		String uname = req.getParameter("uname");
		
		out.println("<h2>Hello, " + uname + ", welcome to the second servlet!</h2>");

		out.println("<a href='/HiddenFormField'>Go to the homepage</a>");
		
		out.close();
	}

}
