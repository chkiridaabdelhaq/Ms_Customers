package com.ensa.mscustomer.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.mscustomer.entities.Customer;
import com.ensa.mscustomer.services.CustomerService;
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerControlle {
	
	
	private CustomerService customerService;
	
	public CustomerControlle(CustomerService customerService) {
		
		this.customerService = customerService;
	}
	@GetMapping("/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Long id) {
		return ResponseEntity.ok(customerService.getCustomer(id));
	}
	
	@PostMapping("/save")
	public void createCustomer(@RequestBody Customer customer) {
		 customerService.createCustomer(customer);
	}
	@PutMapping("/update")
	public void updateCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
	}
	@GetMapping("/name/{firstName}")
	public  ResponseEntity<Customer> getCustomerByName(@PathVariable String firstName) {
		return ResponseEntity.ok(customerService.getCustomerByName(firstName));
	}
	@GetMapping("/delete/{id}")
	public void deleteCustomer(@PathVariable Long id) {
		customerService.deleteCustomer(id);
	}

}
