package com.dmcliver.springhibernatejaxws.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	
	@EmbeddedId
	private AddressPk addressPk = new AddressPk();
	
	@Column(name="ZipCode")
	private int zipCode;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Country")
	private String country;
	
	public Address(){}
	
	public Address(int zipCode, String area, String city, String country) {
		this.zipCode = zipCode;
		this.city = city;
		this.country = country;
	}
	
	public AddressPk getAddressPk() {
		return addressPk;
	}

	public void setAddressPk(AddressPk addressPk) {
		this.addressPk = addressPk;
	}

	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
