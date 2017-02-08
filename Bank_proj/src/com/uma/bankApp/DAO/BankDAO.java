package com.uma.bankApp.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.uma.bankApp.DTO.Location;

public class BankDAO 
{
	public void saveLocation(Location loc)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		 session.save(loc);
		 tx.commit();
	}
}
