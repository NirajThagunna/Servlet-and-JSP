package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// First Servlet to get the data from the user form and do sum operation

public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int sum = num1 + num2;
		
		// Attributes are the objects that are attached by the one servlet to object(session, request, config, context etc..)
		// and other servlet can fetch that object to process to logic.
		request.setAttribute("sum", sum); // request.setAttributes("key", object); key = String
		
		RequestDispatcher rq = request.getRequestDispatcher("secondServlet");
		
		rq.forward(request, response);
	}
	
}
