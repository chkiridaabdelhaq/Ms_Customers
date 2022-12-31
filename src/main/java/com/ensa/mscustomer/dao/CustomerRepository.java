package com.ensa.mscustomer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ensa.mscustomer.entities.Customer;
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	public Customer findByFirstName(String firstName);

}
