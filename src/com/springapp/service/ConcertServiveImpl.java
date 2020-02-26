package com.springapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.dao.ConcertDAO;
import com.springapp.entity.Concert;
@Service
public class ConcertServiveImpl implements ConcertService {
	
	@Autowired
	private ConcertDAO concertDao;
	
	@Transactional
	@Override
	public List<Concert> getConcerts() {
		// TODO Auto-generated method stub
		return concertDao.getConcerts();
	}
	@Transactional
	@Override
	public void saveConcert(Concert theConcert) {
		concertDao.saveConcert(theConcert);

	}
	@Transactional
	@Override
	public Concert getConcert(int id) {
		// TODO Auto-generated method stub
		return concertDao.getConcert(id);
	}
	@Transactional	
	@Override
	public List<Concert> getConcertsLimit() {
		// TODO Auto-generated method stub
		return concertDao.getConcertsLimit();
	}

}
