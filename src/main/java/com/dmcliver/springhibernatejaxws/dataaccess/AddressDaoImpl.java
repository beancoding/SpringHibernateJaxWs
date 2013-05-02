package com.dmcliver.springhibernatejaxws.dataaccess;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dmcliver.springhibernatejaxws.domain.Address;
import com.dmcliver.springhibernatejaxws.domain.Person;

@Repository
public class AddressDaoImpl implements AddressDao{

	private SessionFactory sessionFactory;

	@Autowired
	public AddressDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Person> findByAddress(Address add){
		
		Session sess = sessionFactory.getCurrentSession();
		Query query = sess.createQuery("select a.person from Address a where a.addressPk.number =: number and a.addressPk.street =: street and a.addressPk.area =: area");
		query.setParameter("number", add.getAddressPk().getNumber());
		query.setParameter("street", add.getAddressPk().getStreet());
		query.setParameter("area", add.getAddressPk().getArea());
		return query.list();
	}
}
