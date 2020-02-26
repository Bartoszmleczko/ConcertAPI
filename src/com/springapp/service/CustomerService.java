package com.springapp.service;

import java.util.List;

import com.springapp.entity.Customer;
import com.springapp.entity.Genres;

public interface CustomerService {
	public List<Customer> getCustomers();
	public void saveCustomer(Customer theCustomer);
	public Customer getCustomer(int id);
}
