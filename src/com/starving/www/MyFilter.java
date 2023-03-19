package com.starving.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("<center><h1>FILTER BEFORE INVOKED</h1></center><br>");
		chain.doFilter(req,res);
		pw.println("<center><h1>FILTER BEFORE INVOKED</h1></center><br>");
		
		
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
