package com.uma.bankApp.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Location")
public class Location implements Serializable
{
	
	@Id
	@GenericGenerator(name="abc",strategy="increment")
	@GeneratedValue(generator="abc")
	@Column(name="l_id")
	private int lid;
	@Column(name="l_country")
	private String country;
	@Column(name="l_state")
	private String state;
	
	@OneToMany(cascade=CascadeType.ALL)
	@Column(name="l_id")
	private List<BankDTO> bankList=new ArrayList<BankDTO>();
	
	public Location() {
		System.out.println("New Location Created..");
	}


	public int getLid() {
		return lid;
	}


	public void setLid(int lid) {
		this.lid = lid;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public List<BankDTO> getBankList() {
		return bankList;
	}


	public void setBankList(List<BankDTO> bankList) {
		this.bankList = bankList;
	}
	
	
}
