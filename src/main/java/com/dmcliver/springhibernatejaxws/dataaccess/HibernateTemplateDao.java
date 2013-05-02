package com.dmcliver.springhibernatejaxws.dataaccess;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class HibernateTemplateDao<T> {

	private SessionFactory sessionFactory;

	public HibernateTemplateDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void save(T ad){
		Session sess = sessionFactory.getCurrentSession();
		sess.save(ad);
	}
}
