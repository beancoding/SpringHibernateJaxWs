package com.dmcliver.springhibernatejaxws.services;

import java.util.List;

import com.dmcliver.springhibernatejaxws.domain.Person;
import com.dmcliver.springhibernatejaxws.domain.Profession;

public interface PersonService {
	public abstract List<Person> findByProfession(Profession profession);
}