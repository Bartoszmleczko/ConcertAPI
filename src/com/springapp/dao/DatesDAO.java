package com.springapp.dao;

import java.util.List;

import com.springapp.entity.Customer;
import com.springapp.entity.Dates;

public interface DatesDAO {
public List<Dates> getDates();
	
	public void saveDate( Dates theDate);
	
	public Dates getDate(int id);
}
