package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// sendRedirect() method of the HttpServletResponse interface.
// It is used to redirect response to the another resource.
// It accepts the relative as well as absolute URL.
// It always sends a new request.
public class SendRedirect extends HttpServlet {
	
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
		
		String name = req.getParameter("searchItem");
		
		// sendRedirect()
//		resp.sendRedirect("https://www.google.co.in/#q=" + name);
		
		resp.sendRedirect("home.html");
		
		out.close();
	}

}







