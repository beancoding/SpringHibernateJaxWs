package com.dmcliver.springhibernatejaxws.dataaccess;

import org.springframework.transaction.annotation.Transactional;

import com.dmcliver.springhibernatejaxws.domain.Address;

public interface AddressDao {

	@Transactional
	public abstract void save(Address ad);

}