package com.springapp.dao;

import java.util.List;

import com.springapp.entity.Concert;
import com.springapp.entity.Customer;

public interface ConcertDAO {
	
public List<Concert> getConcerts();

public void saveConcert(Concert theConcert);

public Concert getConcert(int id);
public List<Concert> getConcertsLimit();
}
