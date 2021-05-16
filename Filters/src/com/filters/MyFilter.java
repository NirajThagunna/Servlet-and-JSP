package com.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// Filter class
public class MyFilter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		arg1.setContentType("text/html");
		PrintWriter out = arg1.getWriter();
		
		out.println("Before Filter... pre-processing...");
		System.out.println("Before");
	
		arg2.doFilter(arg0, arg1);
		
		out.println("After Servlet...");
		System.out.println("After");
		
		out.close();
		
	}
}
