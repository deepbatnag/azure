package com.nagarro.azure.service;

import java.util.List;

import com.nagarro.azure.model.Customer;


public interface CustomerService {

	// add customer
	Customer addCustomer(Customer customer);

	// get all customers
	List<Customer> getAllCustomers();

	// get single customer
	Customer getCustomerById(String customerId);

	// update customer details
	Customer updateCustomerDetails(Customer customer, String customerId);

	// delete customer
	void deleteCustomer(String customerId);
}
