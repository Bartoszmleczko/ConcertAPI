package com.springapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springapp.entity.Concert;
import com.springapp.entity.Customer;
@Repository
public class ConcertDAOImpl implements ConcertDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Concert> getConcerts() {
		Session session = sessionFactory.getCurrentSession();
		Query<Concert> theQuery = session.createQuery("from Concert", Concert.class);
		List<Concert> customerList = theQuery.getResultList();
		
		return customerList;
	}

	@Override
	public void saveConcert(Concert theConcert) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(theConcert);

	}

	@Override
	public Concert getConcert(int id) {
		Session session = sessionFactory.getCurrentSession();
		Concert theConcert = session.get(Concert.class, id);
		return theConcert;
	}

	@Override
	public List<Concert> getConcertsLimit() {
		Session session = sessionFactory.getCurrentSession();
		Query<Concert> theQuery = session.createQuery("from Concert", Concert.class);
		List<Concert> customerList = theQuery.setMaxResults(10).list();
		
		return customerList;
	}

}
