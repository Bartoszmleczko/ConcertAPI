package com.springapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springapp.entity.Customer;
import com.springapp.entity.Tickets;
@Repository
public class TicketsDAOImpl implements TicketsDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Tickets> getTickets() {
		Session session = sessionFactory.getCurrentSession();
		Query<Tickets> theQuery = session.createQuery("from Tickets", Tickets.class);
		List<Tickets> ticketList = theQuery.getResultList();
		return ticketList;
	}

	@Override
	public void saveTicket(Tickets theTicket) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(theTicket);
	}

	@Override
	public Tickets getTicket(int id) {
		Session session = sessionFactory.getCurrentSession();
		Tickets ticket = session.get(Tickets.class,id);
		
		return ticket;
	}

	@Override
	public void deleteTickets() {
		Session session = sessionFactory.getCurrentSession();	

	    session.createSQLQuery("truncate table Tickets").executeUpdate();
	}

	@Override
	public void deleteSingleTicket(int id) {
		Session session = sessionFactory.getCurrentSession();
		Tickets ticket = session.get(Tickets.class, id);
		session.delete(ticket);
	}

}
