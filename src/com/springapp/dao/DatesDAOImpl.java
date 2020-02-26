package com.springapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springapp.entity.Customer;
import com.springapp.entity.Dates;
@Repository
public class DatesDAOImpl implements DatesDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Dates> getDates() {
		Session session = sessionFactory.getCurrentSession();
		Query<Dates> theQuery = session.createQuery("from Dates order by date", Dates.class);
		List<Dates> datesList = theQuery.getResultList();
		return datesList;
	}

	@Override
	public void saveDate(Dates theDate) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(theDate);
	}

	@Override
	public Dates getDate(int id) {
		Session session = sessionFactory.getCurrentSession();
		Dates date = session.get(Dates.class, id);
		return date;
	}

}
