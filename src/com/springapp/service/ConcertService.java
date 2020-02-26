package com.springapp.service;

import java.util.List;

import com.springapp.entity.Concert;

public interface ConcertService {
	public List<Concert> getConcerts();

	public void saveConcert(Concert theConcert);

	public Concert getConcert(int id);
	public List<Concert> getConcertsLimit();
}
