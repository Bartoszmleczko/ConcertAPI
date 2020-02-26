package com.springapp.dao;

import java.util.List;

import com.springapp.entity.Band;
import com.springapp.entity.Customer;

public interface BandDAO {
public List<Band> getBands();
	
	public void saveBand(Band theBand);
	
	public Band getBand(int id);
	
}
