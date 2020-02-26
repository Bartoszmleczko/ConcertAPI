package com.springapp.service;

import java.util.List;

import com.springapp.entity.Sectors;

public interface SectorsService {
	public List<Sectors> getSectors();
	
	public void saveSector(Sectors theSector);
	
	public Sectors getSector(int id);
	
	public List<Sectors> getSectorsByVenue(int id) ;
}
