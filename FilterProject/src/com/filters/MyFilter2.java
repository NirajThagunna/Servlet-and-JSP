package com.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter2 implements Filter {
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		long before = System.currentTimeMillis();
		
		chain.doFilter(request, response);
		
		long after = System.currentTimeMillis();
		out.println("Total Response Time : " + (after - before) + "milliseconds");
		System.out.println("Total Response Time : " + (after - before) + "milliseconds");

		out.close();
		
	}

}
