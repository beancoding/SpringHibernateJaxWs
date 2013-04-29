package com.dmcliver.springhibernatejaxws.endpoints;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dmcliver.springhibernatejaxws.domain.Address;
import com.dmcliver.springhibernatejaxws.domain.Person;
import com.dmcliver.springhibernatejaxws.services.PersonService;

// This will be the port name appended with the word port at the end of the name
@Service("PersonServiceEndpoint")
// This will be the service name
@WebService(serviceName="PersonService")
public class PersonServiceEndpoint{

	@Autowired
	 private PersonService personService;

	@WebMethod
	public List<Person> findByAddress(Address address){
		return personService.findByAddress(address);
	}
}
