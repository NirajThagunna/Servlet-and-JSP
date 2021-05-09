package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ServletConfig class
public class ServletConfigClass extends HttpServlet {
	
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
		
		// To get an object of ServletConfig Interface
		ServletConfig config = getServletConfig();
		
		// getting the value of init-param
//		String userName = config.getInitParameter("username");
//		
//		out.println("<h2>Username : " + userName + "</h2>");
		
		// getting the values in the form of array
		Enumeration<String> e = config.getInitParameterNames();
		
		String str = "";
		
		while (e.hasMoreElements()) {
			str = e.nextElement();
			out.println("<h2>Name : " + str + "</h2>");
			out.println("<h3>Value : " + config.getInitParameter(str));
		}
		
		out.close();
		
	}
	
}




