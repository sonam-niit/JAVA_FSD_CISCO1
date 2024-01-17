package com.cisco.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name= req.getParameter("username");
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<h1>Hello From Login Servlet </h1>");
		out.println("<h2>Welcome "+name+"</h2>");
	}

}
