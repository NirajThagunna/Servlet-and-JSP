package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Trying to get the form data

public class SecondServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}

	// service method
	public void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// generating the response
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// get the form data
//		String name = request.getParameter("name"); It will return null because the http protocol is stateless
		
		// getting the Cookies
		Cookie []cookies = request.getCookies(); // Array is an object so it's default value is null
		
		boolean flag = false;
		String name = "";
		
		if (cookies == null) {
			out.println("<h2>Hey, you are the new here. Plz go to the home page</h2>");
			out.println("<h3><a href='/CookiesInServlet'>Go to the home page</a></h3>");
			return;
		}
		else {
			for (Cookie c: cookies) {
				
				String cookieName = c.getName();
				
				if (cookieName.equals("user_name")) {
					flag = true;
					name = c.getValue();
				}
			}
		}
		
		if (flag) {
			out.println("<h1>Hello, " + name + " Welcome to my Website.</h1>");
			out.println("<h2>Thank You!</h2>");
			out.println("<h3><a href='/CookiesInServlet'>home page</a></h3>");
			return;
		}
		else {
			out.println("<h2>Hey, you are the new here. Plz go to the home page</h2>");
			out.println("<h3><a href='CookiesInServlet'>Go to the home page</a></h3>");
		}

		out.close();
	}

}
