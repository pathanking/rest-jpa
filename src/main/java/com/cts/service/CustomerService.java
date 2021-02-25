package com.cts.service;

import java.util.List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Customer;
import com.cts.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;

	public Customer save(Customer customer) {
		return repo.save(customer);
	}

	public List<Customer> getCustomers() {

		return repo.findAll();
	}
}
