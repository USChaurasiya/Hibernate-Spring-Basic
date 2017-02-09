package com.candidjava;
import java.io.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Student_Table")
public class Student implements Serializable 
{
	@Id
	@GenericGenerator(name="abc",strategy="increment")
	@GeneratedValue(generator="abc")
	@Column(name="p_id")
	private long id;
	@Column(name="s_id")
	private String stuid;
	@Column(name="s_reg")
	private String sturegno;
	@Column(name="s_name")
	private String stuname;
	@Column(name="s_College")
	private String sCollege;
	@Column(name="s_degree")
	private String degree;
	@Column(name="s_mobile")
	private String mobileno;
	@Column(name="s_mail")
	private String mailid;

	public long getId() {
		return id;
	}

	public String getStuid() {
		return stuid;
	}
	public String getSturegno() {
		return sturegno;
	}
	public String getStuname() {
		return stuname;
	}
	
	

	public String getDegree() {
		return degree;
	}

	public String getMobileno() {
		return mobileno;
	}
	public String getMailid() {
		return mailid;
	}
	public void setId(long string) {
		id = string;
	}

	public void setStuid(String string) {
		stuid = string;
	}
	public void setSturegno(String string) {
		sturegno = string;
	}
	public void setStuname(String string) {
		stuname = string;
	}
	
	public void setDegree(String string) {
		degree = string;
	}

	public void setMobileno(String string) {
		mobileno = string;
	}
	public void setMailid(String string) {
		mailid = string;
	}

	public String getsCollege() {
		return sCollege;
	}

	public void setsCollege(String sCollege) {
		this.sCollege = sCollege;
	}
	
}
