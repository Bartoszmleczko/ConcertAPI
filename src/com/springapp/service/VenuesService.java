package com.springapp.service;

import java.util.List;

import com.springapp.entity.Venues;

public interface VenuesService {
	public List<Venues> getVenues();

	public void saveVenue(Venues theVenues);

	public Venues getVenue(int id);
	
	public int getSpace(Venues venue);
}
