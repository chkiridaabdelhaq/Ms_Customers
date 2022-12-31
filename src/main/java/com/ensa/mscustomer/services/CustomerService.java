package com.ensa.mscustomer.services;

import com.ensa.mscustomer.entities.Customer;

public interface CustomerService {
	
	public Customer getCustomer(Long id);
	public void createCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public Customer getCustomerByName(String firstName);
	public void deleteCustomer(Long id);
}
