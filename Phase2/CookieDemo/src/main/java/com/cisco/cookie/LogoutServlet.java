package com.cisco.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		Cookie cookies[]=request.getCookies();
		for(int i=0;i<cookies.length;i++) {
			if(cookies[i].getName().equals("email")) {
				cookies[i].setMaxAge(0);//updating age
				response.addCookie(cookies[i]);//add it to user response
			}
		}
		out.print("<h3>Logged Out successfully");
		RequestDispatcher dispatcher= request.getRequestDispatcher("index.html");
		dispatcher.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
