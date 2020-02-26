package com.springapp.dao;

import java.util.List;

import com.springapp.entity.*;

public interface VenuesDAO {
	
public List<Venues> getVenues();

public void saveVenue(Venues theVenues);

public Venues getVenue(int id);

public int getSpace(Venues venue);
}
