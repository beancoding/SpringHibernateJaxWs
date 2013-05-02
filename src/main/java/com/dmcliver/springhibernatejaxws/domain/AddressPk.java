package com.dmcliver.springhibernatejaxws.domain;

import java.io.Serializable;

import javax.persistence.Column;

public class AddressPk implements Serializable{

	private static final long serialVersionUID = 2194116512563143369L;

	@Column(name="Number")
	private int number;
	
	@Column(name="Street")
	private String street;
	
	@Column(name="Area")
	private String area;

	public AddressPk(){}
	
	public AddressPk(int number, String street, String area) {
		super();
		this.number = number;
		this.street = street;
		this.area = area;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
}
