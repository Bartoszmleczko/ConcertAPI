package com.springapp.dao;

import java.util.List;

import com.springapp.entity.Genres;
import com.springapp.entity.Person;

public interface PersonDAO {
public List<Person> getPerson();
	
	public void savePerson(Person thePerson);
	
	public Person getPerson(int id);
	
}
