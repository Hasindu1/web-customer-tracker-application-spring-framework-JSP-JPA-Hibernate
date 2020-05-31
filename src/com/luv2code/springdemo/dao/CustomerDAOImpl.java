package com.luv2code.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	
	public List<Customer> getCustomer() {
		Session session = sessionFactory.getCurrentSession();
		
		Query query =session.createQuery("from Customer order by firstName",Customer.class);
		
	    List<Customer> customers = query.getResultList();
	    
	    
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session session =sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(customer);
		
	}

	@Override
	public Customer getSpecificCustomer(int customerId) {
			Session session =sessionFactory.getCurrentSession();
			
			return (session.get(Customer.class,customerId));
			
		
	}

	@Override
	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(session.get(Customer.class,id));
		
	}

	
	

}
