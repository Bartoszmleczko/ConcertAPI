package com.springapp.dao;

import java.util.List;

import com.springapp.entity.Customer;

public interface CustomerDAO {
		
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(int id);

}
