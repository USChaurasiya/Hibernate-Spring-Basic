package com.uma.loginApp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoginServlet extends HttpServlet {
	
	// protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // TODO Auto-generated method stub
		// }
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserBean user=new UserBean();
		String userName = req.getParameter("user");
		String userPassword = req.getParameter("password");

		System.out.println("User name:" + userName + " & Password:" + userPassword);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		 user.setUser_name(userName);
		 user.setUser_password(userPassword);
		
		session.save(user);
		tx.commit();
		
		System.out.println("User Name is " + user.getUser_name()+" "+userName);
		 System.out.println("User password is " + user.getUser_password()+" "+userPassword);
	
		 /*if(userName.equals(new Long(user.getUser_id()).toString()) && password.equals(user.getUser_password()))
		 {
		 System.out.println("hi");
		 RequestDispatcher rdp = request.getRequestDispatcher("/success.jsp");
		 rdp.forward(request, response);
		 }
		 else
		 { 
		 request.getRequestDispatcher("/fail.jsp").forward(request, response);
		 }*/
		 
	}
	
	


}
