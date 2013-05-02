package com.dmcliver.springhibernatejaxws.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmcliver.springhibernatejaxws.dataaccess.AddressDao;
import com.dmcliver.springhibernatejaxws.domain.Address;
import com.dmcliver.springhibernatejaxws.domain.Person;

@Service
public class PersonServiceImpl implements PersonService{

	private AddressDao addressDao;
	
	@Autowired
	public PersonServiceImpl(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	@Override
	public List<Person> findByAddress(Address address) {
		
		return addressDao.findByAddress(address);
	}
}
