package com.uma.continentApp.DTO;

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
@Table(name = "Country_Table")
public class CountryDTO implements Serializable {

	@Id
	@GenericGenerator(name = "any", strategy = "increment")
	@GeneratedValue(generator = "any")
	@Column(name = "ctryId")
	private int ctryId;
	@Column(name = "ctryName")
	private String ctryName;
	@Column(name = "currency")
	private String ctryCurrency;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cid")
	private ContinentDTO continentDTO;

	public CountryDTO() {
		System.out.println(this.getClass().getSimpleName() + " is Created..");
	}

	public int getCtryId() {
		return ctryId;
	}

	public void setCtryId(int ctryId) {
		this.ctryId = ctryId;
	}

	public String getCtryName() {
		return ctryName;
	}

	public void setCtryName(String ctryName) {
		this.ctryName = ctryName;
	}

	public String getCtryCurrency() {
		return ctryCurrency;
	}

	public void setCtryCurrency(String ctryCurrency) {
		this.ctryCurrency = ctryCurrency;
	}

	public ContinentDTO getContinentDTO() {
		return continentDTO;
	}

	public void setContinentDTO(ContinentDTO continentDTO) {
		this.continentDTO = continentDTO;
	}

}
