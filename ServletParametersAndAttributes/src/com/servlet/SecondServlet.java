package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Second servlet when we send the attributes from the first servlet

public class SecondServlet extends HttpServlet {

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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));

		int product = num1 * num2;

		// Getting the attributes values
		int sum = (int)request.getAttribute("sum");
		
		out.println("<h2>Results : </h2>");
		out.println("<h2>Sum : " + sum + "</h2>");
		out.println("<h2>Product : " + product + "</h2>");
		out.println("<a href='/ServletParametersAndAttributes'>Go to the home page</a>");
		
		out.close();
	}
}
