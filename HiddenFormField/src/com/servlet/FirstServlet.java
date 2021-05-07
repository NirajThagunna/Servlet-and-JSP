package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		// URL Rewriting
		// appending the name in the query String
		// appending the name in the url of the second servlet
//		out.println("<a href='secondServlet?name="+ name +"'>Go to the second servlet...</a>");
		
		// Creating a hidden form field 
		out.println("<form action='secondServlet'>"
				+ "<input type='hidden' name='uname' value='"+ name +"'/>"
				+ "<input type='submit' value='Go to the second servlet'/>"
				+ "</form>");
		
		out.close();
	}

}
