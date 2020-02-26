package com.springapp.service;

import java.util.List;

import com.springapp.entity.Band;

public interface BandService {
public List<Band> getBands();
	
	public void saveBand(Band theBand);
	
	public Band getBand(int id);
}
