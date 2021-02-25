package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Customer;
import com.cts.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;

	@PostMapping("customers")
	public Customer customers(@RequestBody Customer customer) {
		return service.save(customer);

	}

	@GetMapping
	public List<Customer> getCustomers() {
		return service.getCustomers();
	}

}
