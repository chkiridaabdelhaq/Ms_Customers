package com.ensa.mscustomer.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ensa.mscustomer.entities.Customer;
@RepositoryRestResource
public interface CustomerRepository extends MongoRepository<Customer, Long> {
	
	public Customer findByFirstName(String firstName);

}
