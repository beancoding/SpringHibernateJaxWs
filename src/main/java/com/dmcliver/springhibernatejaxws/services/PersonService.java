package com.dmcliver.springhibernatejaxws.services;

import java.util.List;

import com.dmcliver.springhibernatejaxws.domain.Address;
import com.dmcliver.springhibernatejaxws.domain.Person;

public interface PersonService {
	public abstract List<Person> findByAddress(Address address);
}