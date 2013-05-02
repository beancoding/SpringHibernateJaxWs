package com.dmcliver.springhibernatejaxws.dataaccess;

import java.util.List;

import com.dmcliver.springhibernatejaxws.domain.Person;
import com.dmcliver.springhibernatejaxws.domain.Profession;

public interface PersonDao {

	List<Person> findByProfession(Profession profession);
}
