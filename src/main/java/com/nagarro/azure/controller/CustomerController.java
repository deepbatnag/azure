package com.nagarro.azure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.azure.model.Customer;
import com.nagarro.azure.service.CustomerService;


@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	// add customer
	@PostMapping
	public ResponseEntity<Customer> createUser(@RequestBody Customer customer) {
		Customer customer1 = null;
		try {
			customer1 = customerService.addCustomer(customer);
			return ResponseEntity.status(HttpStatus.CREATED).body(customer1);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	// get single customer
	@GetMapping("/{customerId}")
	public ResponseEntity<Customer> getSingleUser(@PathVariable String customerId) {
		Customer customer = customerService.getCustomerById(customerId);
		if (customer == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		return ResponseEntity.ok(customer);
	}

	// get all customers
	@GetMapping
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customers = customerService.getAllCustomers();
		if (customers.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(customers);
	}

	// update customer
	@PutMapping("/{customerId}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable String customerId) {
		try {
			Customer customer1 = customerService.updateCustomerDetails(customer, customerId);
			return ResponseEntity.status(HttpStatus.CREATED).body(customer1);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@DeleteMapping("/{customerId}")
	public ResponseEntity deleteCustomer(@PathVariable String customerId) {
		try {
			customerService.deleteCustomer(customerId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}

	}

}
