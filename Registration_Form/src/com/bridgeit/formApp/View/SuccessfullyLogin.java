package com.bridgeit.formApp.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessfullyLogin extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer=response.getWriter();
		
		writer.println("<html>"+"<body bgcolor='white'>"+"<center>"+"Welcome You have Login Successfully.."+"</center>"+"</body>"+"</html>");
	}
}
