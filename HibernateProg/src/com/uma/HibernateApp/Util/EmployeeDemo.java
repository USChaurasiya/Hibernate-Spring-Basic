package com.uma.HibernateApp.Util;

import com.uma.HibernateApp.DAO.EmployeeDAO;
import com.uma.HibernateApp.DTO.EmployeeDto;

public class EmployeeDemo 
{
	public static void main(String[] args) {
		EmployeeDto dto=new  EmployeeDto();
		
		dto.setName("Satyendra Singh");
		dto.setAge(25);
		dto.setAddress("MP");
		dto.setDesignation("Java Developer");
		EmployeeDAO dao=new EmployeeDAO();
		dao.saveEmployee(dto);
		System.out.println("Data Added Sucessfully..");
		
	}
}
