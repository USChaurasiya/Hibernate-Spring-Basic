package com.uma.HibernateApp.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@SuppressWarnings("serial")
@Entity
@Table(name="Employee_Table")
public class EmployeeDto implements Serializable 
{
	@Id
	@GenericGenerator(name="abc", strategy = "increment")
	@GeneratedValue(generator="abc")
	private int id;
	@Column(name="Emp_name")
	private String name;
	@Column(name="Emp_designation")
	private String designation;
	@Column(name="Emp_age")
	private int age;
	@Column(name="Emp_add")
	private String address;
	
	public EmployeeDto() 
	{
		System.out.println("Employee Object is Created...");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
	

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
