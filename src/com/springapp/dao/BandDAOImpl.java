package com.springapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springapp.entity.Band;
import com.springapp.entity.Customer;
@Repository
public class BandDAOImpl implements BandDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Band> getBands() {
		Session session = sessionFactory.getCurrentSession();
		Query<Band> theQuery = session.createQuery("from Band", Band.class);
		List<Band> bandList = theQuery.getResultList();
		return bandList;
	}

	@Override
	public void saveBand(Band theBand) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(theBand);
	}

	@Override
	public Band getBand(int id) {
		Session session = sessionFactory.getCurrentSession();
		Band theBand = session.get(Band.class,id);
		return theBand;
	}

}
