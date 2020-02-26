package com.springapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.dao.PersonDAO;
import com.springapp.entity.Person;
@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDAO personDAO;
	
	@Transactional
	@Override
	public List<Person> getPerson() {

		return personDAO.getPerson();
	}
	@Transactional
	@Override
	public void savePerson(Person thePerson) {
		personDAO.savePerson(thePerson);

	}
	@Transactional
	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		return personDAO.getPerson(id);
	}

}
