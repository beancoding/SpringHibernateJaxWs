package com.dmcliver.springhibernatejaxws.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Person {
	
	@Id
	@Column(name="Name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="AddressId")
	private Address address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person(){
		
	}
	
	public Person(String name) {
		this.name = name;
	}

	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
}
