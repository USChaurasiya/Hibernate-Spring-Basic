package com.uma.HibernateApp.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.uma.HibernateApp.DTO.EmployeeDto;

public class EmployeeDAO 
{
	public EmployeeDAO() {

		System.out.println("Employee DAO Created..");
	}
	public void saveEmployee(EmployeeDto dto)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(EmployeeDto.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(dto);
		tx.commit();
	}
}