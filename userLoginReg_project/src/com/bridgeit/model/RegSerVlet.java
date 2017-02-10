package com.bridgeit.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.dao.UserRegDao;

public class RegSerVlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
								throws ServletException, IOException{
String ln;
	String fn;
String em;
	String un;
	String pas;
		
		fn=req.getParameter("fname");
		ln=req.getParameter("lname");
		em=req.getParameter("email");
		un=req.getParameter("uname");
		pas=req.getParameter("pass");
		
		UserReg ur = new UserReg(fn, ln, em, un, pas);
		
		UserRegDao dao = new UserRegDao();
		dao.saveUser(ur);
		System.out.println("Data saved");
		
	}
}
