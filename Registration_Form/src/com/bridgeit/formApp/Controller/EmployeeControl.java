package com.bridgeit.formApp.Controller;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bridgeit.formApp.Model.Employee;



public class EmployeeControl 
{
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
	public void addEmployee(String id,String name,String dept,String age,String exp,String address,String mobile,String mail)
	{
		try {
			Session s=getSession();
				org.hibernate.Transaction tx=s.beginTransaction();
				
				Employee emp=new Employee();
				emp.setId(1);
				emp.setEid(id);
				emp.setEname(name);
				emp.setEdept(dept);
				emp.setEage(age);
				emp.setExp(exp);
				emp.setEadd(address);
				emp.setEmobile(mobile);
				emp.setEmail(mail);
				
				s.save(emp);
				tx.commit();
				System.out.println("\n Employee Record Added..");
		} catch (HibernateException e) {
			
			System.out.println(e.getMessage());
			System.out.println("error");
		}
			
	}
	public Employee getEmployeeByName(String name)
	{
		Session s=getSession();
		String query="select eid from Employee where ename='"+name+"'";
		
		
		Query q1=s.createQuery(query);
		//q1.setParameter(0,name);
		System.out.println("Employee List:");
		List<Employee> empList=q1.list();
		return (empList.get(0));
		
		/*
		for(Employee emp : empList){
			System.out.println("List of Employees::"+emp.getEid()+","+emp.getEname()+","+emp.getEmail());
		}*/
	}
	
}
