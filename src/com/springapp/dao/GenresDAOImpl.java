package com.springapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springapp.entity.Band;
import com.springapp.entity.Customer;
import com.springapp.entity.Genres;
@Repository
public class GenresDAOImpl implements GenresDAO {
			
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Genres> getGenres() {
		Session session = sessionFactory.getCurrentSession();
		Query<Genres> theQuery = session.createQuery("from Genres", Genres.class);
		List<Genres> genresList = theQuery.getResultList();
		return genresList;
	}

	@Override
	public void saveGenre(Genres theGenre) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(theGenre);
	}

	@Override
	public Genres getGenre(int id) {
		Session session = sessionFactory.getCurrentSession();
		Genres genre = session.get(Genres.class,id);
		return genre;
	}



}
