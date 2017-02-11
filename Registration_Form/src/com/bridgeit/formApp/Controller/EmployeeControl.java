package com.bridgeit.formApp.Controller;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bridgeit.formApp.Model.Employee;



/**
 * This Class Contain two method one as addEmployee() which is used to add particular Employee Details into Data Base and Second is getEmployeeByName() which is used to find Employee Id according to Employee name.
 * @author um@.
 *
 */
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
	/**
	 * This method is used to add a particular Employee Details into data base by using Hibernate.
	 * @param id (String)
	 * @param name(String)
	 * @param dept (String)
	 * @param age (String)
	 * @param exp (String)
	 * @param address (String)
	 * @param mobile (String)
	 * @param mail (String)
	 */
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
	
	/**
	 * This method is used to find the particular Employee Id by Employee Name
	 * It take {@link String} Type Parameter.
	 * @param name 
	 * @return String ID
	 */
	public String  getEmployeeByName(String name)
	{
		Session s=getSession();
		String query="select e.eid from Employee e where e.ename='"+name+"'";
		Query q1=s.createQuery(query);
		String e=(String) q1.uniqueResult();
		return e;
		/*
		 q1.setParameter(0,name);
		System.out.println("Employee List:");
		List<Employee> empList=q1.list();
	System.out.println(empList.get(0).getEid());
		return (empList.get(0).getEid());
		for(Employee emp : empList){
			System.out.println("List of Employees::"+emp.getEid()+","+emp.getEname()+","+emp.getEmail());
		}*/
	}
	
}
