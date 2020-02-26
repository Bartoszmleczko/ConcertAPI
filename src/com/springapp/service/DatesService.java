package com.springapp.service;

import java.util.List;

import com.springapp.entity.Dates;

public interface DatesService {
public List<Dates> getDates();
	
	public void saveDate( Dates theDate);
	
	public Dates getDate(int id);
}
