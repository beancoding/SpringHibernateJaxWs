package com.dmcliver.springhibernatejaxws.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmcliver.springhibernatejaxws.dataaccess.PersonDao;
import com.dmcliver.springhibernatejaxws.domain.Person;
import com.dmcliver.springhibernatejaxws.domain.Profession;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonDao personDao;
	
	@Override
	public List<Person> findByProfession(Profession profession) {
		
		return personDao.findByProfession(profession);
	}
}
