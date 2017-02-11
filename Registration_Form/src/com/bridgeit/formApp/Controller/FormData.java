package com.bridgeit.formApp.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * FormData Class is used to Fetch the Registration form Data .
 * @author um@.
 *
 */
public class FormData extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String eid;
		String name;
		String dept;
		String age;
		String exp;
		String address;
		String mobile;
		String mail;
		
		 eid=req.getParameter("eId");
		 name =req.getParameter("eName");
		 dept=req.getParameter("eDept");
		 age=req.getParameter("eAge");
		 exp=req.getParameter("eExp");
		 address=req.getParameter("eAdd");
		 mobile=req.getParameter("eMobile");
		 mail=req.getParameter("eMail");
		
		HttpSession session=req.getSession();
		
		try {
			EmployeeControl emp=new EmployeeControl();
			emp.addEmployee(eid,name,dept,age,exp,address,mobile,mail);
			resp.sendRedirect("Success");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
