package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// All the form data will be send in the RegistrationServlet - Servlet

public class RegistrationServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	// service() method
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h2>Servlet Form Data</h2>");
		
		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String phoneNumber = request.getParameter("user_number");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		String condition = request.getParameter("condition");
		
		if (condition != null) {
			if (condition.equals("Checked")) {
				out.println("<h2>Name : " + name + "</h2>");
				out.println("<h2>Email : " + email + "</h2>");
				out.println("<h2>phone Number : " + phoneNumber + "</h2>");
				out.println("<h2>Gender : " + gender + "</h2>");
				out.println("<h2>Course : " + course + "</h2>");
			}
		}
		else {
			out.println("<h2>You have not Agree with terms and conditions!</h2>");
		}
		
		out.close();
	}
	
}
