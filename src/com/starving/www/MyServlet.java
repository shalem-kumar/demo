package com.starving.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class MyServlet extends HttpServlet
{
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("<center><h1>FILTER INVOKED MIDDLE</h1></center><br>");
	}
}
