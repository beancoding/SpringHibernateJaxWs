package com.dmcliver.springhibernatejaxws.dataaccess;

import java.util.List;

import com.dmcliver.springhibernatejaxws.domain.Address;
import com.dmcliver.springhibernatejaxws.domain.Person;

public interface AddressDao {

	public abstract List<Person> findByAddress(Address add);
}