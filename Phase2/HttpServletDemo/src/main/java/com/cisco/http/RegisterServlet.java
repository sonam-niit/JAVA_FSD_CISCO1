package com.cisco.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out= resp.getWriter();
		out.print("<h1>Hello From Http Servlet</h1>");
		String fname= req.getParameter("fname");
		String lname= req.getParameter("lname");
		if(fname.equals("") || lname.equals("")) {
			resp.sendRedirect("index.html");
		}else {
			out.print("Welcome "+fname+" "+lname);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
