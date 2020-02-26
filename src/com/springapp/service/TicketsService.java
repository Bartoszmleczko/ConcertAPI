package com.springapp.service;

import java.util.List;

import com.springapp.entity.*;

public interface TicketsService {
	public List<Tickets> getTickets();
	public void saveTickets(Tickets theTicket);
	public Tickets getTicket(int id);
	public void deleteTickets();
	public void deleteSingleTicket(int id);
}
