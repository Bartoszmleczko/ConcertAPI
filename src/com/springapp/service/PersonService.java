package com.springapp.service;

import java.util.List;

import com.springapp.entity.Person;

public interface PersonService {
public List<Person> getPerson();
	
	public void savePerson(Person thePerson);
	
	public Person getPerson(int id);
}
