package com.bridgeit.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.model.UserReg;


public class UserRegDao
{
	public UserRegDao() {
		System.out.println(this.getClass().getSimpleName()+"Created...");
	}
	
	private static  SessionFactory sessionFactory;
	  private Session getSession()
	  {
	  Session s =null;
	     try{
		 		sessionFactory = new Configuration().configure().buildSessionFactory();
	 		s=sessionFactory.openSession();
	 		}catch(HibernateException e){
					System.out.println(e.getMessage());
	}
		   return s;
	  }
	public void saveUser(UserReg reg)
	{
		try {
			Session s=getSession();
			Transaction tx=s.beginTransaction();
				s.save(reg);
				tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}
}
