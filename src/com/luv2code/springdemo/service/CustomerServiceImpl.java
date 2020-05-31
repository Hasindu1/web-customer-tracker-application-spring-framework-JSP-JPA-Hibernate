package com.luv2code.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.dao.CustomerDAOImpl;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	//need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomer() {
		return customerDAO.getCustomer();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		customerDAO.saveCustomer(customer);
		
	}

	@Override
	@Transactional
	public Customer getSpeceficCustomer(int customerId) {
		return (customerDAO.getSpecificCustomer(customerId));
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		customerDAO.deleteCustomer(id);
		
	}

	
	

	

}
