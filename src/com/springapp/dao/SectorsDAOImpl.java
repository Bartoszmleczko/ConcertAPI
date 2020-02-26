package com.springapp.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.Session;
import com.springapp.entity.Sectors;
@Repository
public class SectorsDAOImpl implements SectorsDAO {
	@Autowired
	private SessionFactory SessionFactory;
	
	@Override
	public List<Sectors> getSectors() {
		org.hibernate.Session session = SessionFactory.getCurrentSession();
		Query<Sectors> theQuery = session.createQuery("from Sectors",Sectors.class);
		List<Sectors> sectorsList = theQuery.getResultList();
				return sectorsList;
	}
	
	@Override
	public void saveSector(Sectors theSector) {
		org.hibernate.Session session = SessionFactory.getCurrentSession();
		session.saveOrUpdate(theSector);
	}
	@Override
	public Sectors getSector(int id) {
		org.hibernate.Session session = SessionFactory.getCurrentSession();
		Sectors sector = session.get(Sectors.class, id);
		return sector;
	}

	@Override
	public List<Sectors> getSectorsByVenue(int id) {
		org.hibernate.Session session = SessionFactory.getCurrentSession();
		Query<Sectors> theQuery = session.createQuery("from Sectors where Sectors.venue_id ="+ id,Sectors.class);
		List<Sectors> sectorsList = theQuery.list();
		return sectorsList;
	}



}
