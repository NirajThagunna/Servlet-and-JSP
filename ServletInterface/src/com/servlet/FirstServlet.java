package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// By implementing Servlet interface - Creating a Servlet
public class FirstServlet implements Servlet {

	ServletConfig config = null;

	// Initializing the Servlet - first part of life cycle of Servlet Interface
	// initializes the servlet. It is the life cycle method of servlet and invoked by the web container only once.
	// Called by the servlet container to indicate to a servlet that theservlet is being placed into service. 
	// The servlet container calls the init method exactly once after instantiating the servlet.
	// The init method must complete successfully before the servlet can receive any requests. 
	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("Servlet is initialized");
	}

	// provides response for the incoming request. It is invoked at each request by the web container.
	public void service(ServletRequest request, ServletResponse response) throws IOException, ServletException {
		System.out.println("Servicing the servlet");
		
		response.setContentType("text/html"); // setting the content type
		
		PrintWriter out = response.getWriter(); // get the stream to write the data
		
		// Writing html in the stream
		out.println("<h1>Hello from the Servlet Interface<h1>");
		out.println("<h2>Today's date and time is : " + new Date().toString() + "</h2>");
		
		// Closing the stream
		out.close();
	}

	// is invoked only once and indicates that servlet is being destroyed.
	public void destroy() {
		System.out.println("Servlet is destroyed");
	}


	// returns the object of ServletConfig.
	// Returns a ServletConfig object, which contains initialization and startup parameters for this servlet.
	// The ServletConfig object returned is the one passed to the init method. 
	public ServletConfig getServletConfig() {
		return config;
	}

	// returns information about servlet such as writer, copyright, version etc.
	public String getServletInfo() {
		return "Niraj Thagunna";
	}
}
