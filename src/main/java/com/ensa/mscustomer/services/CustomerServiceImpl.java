package com.ensa.mscustomer.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ensa.mscustomer.dao.CustomerRepository;
import com.ensa.mscustomer.entities.Customer;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository repository;

	public CustomerServiceImpl(CustomerRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Customer getCustomer(Long id) {
		
		if(id == null) {
			return null;
		}
		Customer customer=repository.findById(id).get();
		
		
		return customer;
	}

	@Override
	public void createCustomer(Customer customer) {
		
		repository.save(customer);
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		
		repository.save(customer);
		
	}

	@Override
	public Customer getCustomerByName(String firstName) {
		
		if(firstName == null) {
			return null;
		}
		
		Customer customer=repository.findByFirstName(firstName);
		
		return customer;
	}

	@Override
	public void deleteCustomer(Long id) {
		
		repository.deleteById(id);
		
	}

}
