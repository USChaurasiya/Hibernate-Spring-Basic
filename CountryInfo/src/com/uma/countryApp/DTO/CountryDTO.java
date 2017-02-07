package com.uma.countryApp.DTO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Country")
public class CountryDTO implements Serializable
{
	@Id
	@GenericGenerator(name="abc", strategy="increment")
	@GeneratedValue(generator="abc")
	@Column(name="cid")
	private int cid;
	@Column(name="name")
	private String name;
	@Column(name="currency")
	private String currency;
	@Column(name="state")
	private int state;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cid")
	
	private List<StateDTO> stateDTO;
	public CountryDTO() {
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public List<StateDTO> getStateDTO() {
		return stateDTO;
	}
	public void setStateDTO(List<StateDTO> stateDTO) {
		this.stateDTO = stateDTO;
	}
	
	
}
