package com.uma.countryApp.DTO;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="State")
public class StateDTO implements Serializable 
{
	@Id
	@GenericGenerator(name="any", strategy="increment")
	@GeneratedValue(generator="any")
	@Column(name="s_id")
	private int sid;
	@Column(name="state_name")
	private String sName;
	@Column(name="state_lang")
	private String language;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cid")
	private CountryDTO countryDTO;
	
	public StateDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	
	
	
}
