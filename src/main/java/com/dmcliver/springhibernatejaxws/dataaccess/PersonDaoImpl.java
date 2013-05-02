package com.dmcliver.springhibernatejaxws.dataaccess;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dmcliver.springhibernatejaxws.domain.Person;
import com.dmcliver.springhibernatejaxws.domain.Profession;

@Repository
public class PersonDaoImpl implements PersonDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Person> findByProfession(Profession profession) {
		Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(Person.class,"per")
				.createAlias("per.profession", "pro")
				.add(Restrictions.eq("pro.name", profession.getName()))
				.list();
	}
}
