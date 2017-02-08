package com.uma.bankApp.Service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.uma.bankApp.DTO.BankDTO;

public class BankService 
{
	public void getBank()
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		String query="select b from BankDTO b ";
		Query q1=session.createQuery(query);
		System.out.println("Bank List:");
		List<BankDTO> bankList=q1.list();
		for(BankDTO bank : bankList){
			System.out.println("List of Employees::"+bank.getBid()+","+bank.getName()+","+bank.getManager());
		}
	}
	public void updateBank()
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Query q1= session.createQuery("update BankDTO b set name= :name where id= :id");
		q1.setParameter("name", "HSBC");
		q1.setLong("id", 2);
		int result = q1.executeUpdate();
		System.out.println("Bank update status: " +result);
	}
	
	public void deleteBank()
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Query q1= session.createQuery("delete from Location l  where id= :id");
		
		q1.setInteger("id", 3);
		int result = q1.executeUpdate();
		System.out.println("Location update status: " +result);
		
		
		 q1= session.createQuery("delete from BankDTO b  where id= :id");
		
		q1.setInteger("id", 3);
		 result = q1.executeUpdate();
		System.out.println("Bank update status: " +result);
	}
}
