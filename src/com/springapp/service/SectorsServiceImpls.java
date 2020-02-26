package com.springapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.dao.SectorsDAO;
import com.springapp.entity.Sectors;
@Service
public class SectorsServiceImpls implements SectorsService {
	
	@Autowired
	private SectorsDAO sectorsDAO;
	
	@Transactional
	@Override
	public List<Sectors> getSectors() {
		return sectorsDAO.getSectors();
	}
	@Transactional
	@Override
	public void saveSector(Sectors theSector) {
		sectorsDAO.saveSector(theSector);
	}
	@Transactional
	@Override
	public Sectors getSector(int id) {
		return sectorsDAO.getSector(id);
	}
	@Transactional
	@Override
	public List<Sectors> getSectorsByVenue(int id) {
		
		return sectorsDAO.getSectorsByVenue(id);
	}

}
