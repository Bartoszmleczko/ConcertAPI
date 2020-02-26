package com.springapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.dao.DatesDAO;
import com.springapp.entity.Dates;
@Service
public class DatesServiceImpl implements DatesService {
	
	@Autowired
	private DatesDAO datesDAO;
	
	@Transactional
	@Override
	public List<Dates> getDates() {

		return datesDAO.getDates();
	}
	@Transactional
	@Override
	public void saveDate(Dates theDate) {
		datesDAO.saveDate(theDate);

	}
	@Transactional
	@Override
	public Dates getDate(int id) {

		return datesDAO.getDate(id);
	}

}
