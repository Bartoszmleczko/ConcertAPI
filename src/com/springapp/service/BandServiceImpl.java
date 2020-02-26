package com.springapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.dao.BandDAO;
import com.springapp.entity.Band;
@Service
public class BandServiceImpl implements BandService {
	
	@Autowired
	private BandDAO bandDAO;
	@Transactional
	@Override
	public List<Band> getBands() {
		return bandDAO.getBands();
	}
	@Transactional
	@Override
	public void saveBand(Band theBand) {
		bandDAO.saveBand(theBand);

	}
	@Transactional
	@Override
	public Band getBand(int id) {
		return bandDAO.getBand(id);
	}

}
