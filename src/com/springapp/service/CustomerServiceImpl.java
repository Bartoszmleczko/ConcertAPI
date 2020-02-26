package com.springapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.dao.CustomerDAO;
import com.springapp.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO customerDAO;
	
	@Transactional
	@Override
	public List<Customer> getCustomers() {
		
		return customerDAO.getCustomers();
	}
	
	@Transactional
	@Override
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);

	}
	@Transactional
	@Override
	public Customer getCustomer(int id) {

		return customerDAO.getCustomer(id);
	}

}
