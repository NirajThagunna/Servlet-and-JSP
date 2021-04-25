package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// LoginServlet to validate the input form data

public class LoginServlet extends HttpServlet {

	// The serialVersionUID is a universal version identifier for a Serializable class.
	// Equivalent to the ID card of java class. 
	// Mainly used for version control. 
	// The function of serialVersionUID is to maintain the compatibility of versions during serialization, that is, 
	// when the version is upgraded, the deserialization still maintains the uniqueness of the object.
	private static final long serialVersionUID = 1L;
	
	// doPost()
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if (username.equals("nirajthagunna") && password.equals("NIRAJ")) {
			
			RequestDispatcher rq = request.getRequestDispatcher("successServlet");
			rq.forward(request, response);
		}
		else {
			out.println("<h2>Login Failed!!!</h2>");
			out.println("<h2>Username and Password does not match</h2>");
			
			RequestDispatcher rq = request.getRequestDispatcher("index.html");
			rq.include(request, response);
		}
		
		out.close();
	}
}








