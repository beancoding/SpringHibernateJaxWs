package com.dmcliver.springhibernatejaxws.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Number")
	private int number;
	
	@Column(name="Street")
	private String street;
	
	@Column(name="ZipCode")
	private int zipCode;
	
	@Column(name="Area")
	private String area;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Country")
	private String country;
	
	public Address(){}
	
	public Address(int number, String street, int zipCode, String area,
			String city, String country) {
		this.number = number;
		this.street = street;
		this.zipCode = zipCode;
		this.area = area;
		this.city = city;
		this.country = country;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
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
