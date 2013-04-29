package com.dmcliver.springhibernatejaxws.dataaccess;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dmcliver.springhibernatejaxws.domain.Address;
import com.dmcliver.springhibernatejaxws.domain.Person;

@Repository
public class AddressDaoImpl implements AddressDao {

	private SessionFactory sessionFactory;

	@Autowired
	public AddressDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public void save(Address ad){
		Session sess = sessionFactory.getCurrentSession();
		sess.save(ad);
	}
}
