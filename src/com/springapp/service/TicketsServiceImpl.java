package com.springapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.dao.TicketsDAO;
import com.springapp.entity.Tickets;

@Service
public class TicketsServiceImpl implements TicketsService {
	
	@Autowired
	private TicketsDAO ticketsDAO;
	
	@Transactional
	@Override
	public List<Tickets> getTickets() {

		return ticketsDAO.getTickets();
	}
	@Transactional
	@Override
	public void saveTickets(Tickets theTicket) {
		ticketsDAO.saveTicket(theTicket);

	}
	@Transactional
	@Override
	public Tickets getTicket(int id) {

		return 		ticketsDAO.getTicket(id);
	}
	@Transactional
	@Override
	public void deleteTickets() {
		ticketsDAO.deleteTickets();
		
	}
	@Transactional
	@Override
	public void deleteSingleTicket(int id) {
		ticketsDAO.deleteSingleTicket(id);
		
	}

}
