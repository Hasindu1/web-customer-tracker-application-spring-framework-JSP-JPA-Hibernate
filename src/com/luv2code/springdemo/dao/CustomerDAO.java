package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomer();
	
	public void saveCustomer(Customer customer);
	
	public Customer getSpecificCustomer(int customerId);
	
	public void deleteCustomer(int id);
}
