package com.springapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.springapp.entity.Genres;
import com.springapp.entity.Person;
import com.springapp.entity.Sectors;
@Repository
public class PersonDAOImpl implements PersonDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Person> getPerson() {

		Session session = sessionFactory.getCurrentSession();
		Query<Person> theQuery = session.createQuery("from Person",Person.class);
		List<Person> personList = theQuery.getResultList();
		return personList;
	}

	@Override
	public void savePerson(Person thePerson) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(thePerson);

	}

	@Override
	public Person getPerson(int id) {
			Session session = sessionFactory.getCurrentSession();
		Person person = session.get(Person.class, id);
		return person;
	}

}
