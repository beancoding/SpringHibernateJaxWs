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
	
	@ManyToOne
	@JoinColumn(name="ProfessionID")
	private Profession profession;
	
	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

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
}
