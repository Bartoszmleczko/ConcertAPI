package com.springapp.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springapp.entity.Sectors;
import com.springapp.entity.Venues;
@Repository
public class VenuesDAOImpl implements VenuesDAO {
	
	
@Autowired
private SessionFactory sessionFactory;

	@Override
	public List<Venues> getVenues() {
		Session session = sessionFactory.getCurrentSession();
		Query<Venues> theQuery = session.createQuery("from Venues", Venues.class);
		List<Venues> venuesList = theQuery.getResultList();
		return venuesList;
	}

	@Override
	public void saveVenue(Venues theVenues) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(theVenues);
	}

	@Override
	public Venues getVenue(int id) {
		Session session = sessionFactory.getCurrentSession();
		Venues venue = session.get(Venues.class, id);
		return venue;
	}

	@Override
	public int getSpace(Venues venue) {
		Session session = sessionFactory.getCurrentSession();
		List<Sectors> sectors = venue.getSectors();
		int sum=0;
		for( Sectors s:sectors) {
			sum += s.getSector_capacity();
		}
		return sum;
	}
	

}
