package com.uma.countryApp.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.uma.countryApp.DTO.CountryDTO;

public class CountryDAO 
{
	public CountryDAO() 
	{
		System.out.println("Country DAO Created..");
	}
	
	public void saveCountry(CountryDTO dto)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(dto);
		tx.commit();
	}
}
