package com.dmcliver.springhibernatejaxws.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Person {
	
	@Id
	@Column(name="Name")
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(){}
	
	public Person(String name) {
		this.name = name;
	}
	
	@Column(name="Number",insertable=false,updatable=false)
	private int number;
	@Column(name="Area",insertable=false,updatable=false)
	private String area;
	@Column(name="Street",insertable=false,updatable=false)
	private String street;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="Number",referencedColumnName="Number"),
		@JoinColumn(name="Street",referencedColumnName="Street"),
		@JoinColumn(name="Area",referencedColumnName="Area"),
	})
	Address address;
}
