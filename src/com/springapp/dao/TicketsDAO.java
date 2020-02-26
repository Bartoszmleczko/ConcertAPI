package com.springapp.dao;

import java.util.List;

import com.springapp.entity.Customer;
import com.springapp.entity.Tickets;

public interface TicketsDAO {
	
	public List<Tickets> getTickets();
	
	public void saveTicket(Tickets theTicket);
	
	public Tickets getTicket(int id);
	
	public void deleteTickets();
	
	public void deleteSingleTicket(int id);
	
}
