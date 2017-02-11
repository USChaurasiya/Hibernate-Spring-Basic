package com.bridgeit.formApp.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgeit.formApp.Model.Employee;

public class LoginForm extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id;
		String name;
		
		id=req.getParameter("eId");
		name=req.getParameter("eName");
		HttpSession session=req.getSession();
		
		EmployeeControl emp=new  EmployeeControl();
		String e=emp.getEmployeeByName(name);
		
			
		if(id.equals(e))
		{
			resp.sendRedirect("SuccessfullLogin");
		}
		else
		{
			System.out.println("Invalid ID or Name");
			resp.sendRedirect("fail");
		}
	}
	
	
}
