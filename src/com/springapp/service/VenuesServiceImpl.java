package com.springapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.dao.VenuesDAO;
import com.springapp.entity.Venues;
@Service
public class VenuesServiceImpl implements VenuesService {

	@Autowired
	private VenuesDAO venuesDAO;
	
	@Transactional
	@Override
	public List<Venues> getVenues() {

		return venuesDAO.getVenues();
	}
	@Transactional
	@Override
	public void saveVenue(Venues theVenues) {
		venuesDAO.saveVenue(theVenues);

	}
	@Transactional
	@Override
	public Venues getVenue(int id) {

		return venuesDAO.getVenue(id);
	}
	@Transactional
	@Override
	public int getSpace(Venues venue) {

		return venuesDAO.getSpace(venue);
	}

}
