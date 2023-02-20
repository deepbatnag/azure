package com.nagarro.azure.service.imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.azure.dao.CustomerDao;
import com.nagarro.azure.exceptions.ResourceNotFoundException;
import com.nagarro.azure.model.Account;
import com.nagarro.azure.model.Customer;
import com.nagarro.azure.service.AccountService;
import com.nagarro.azure.service.CustomerService;


@Service
public class CustomerServiceImplementation implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private AccountService accountService;

	@Override
	public Customer addCustomer(Customer customer) {
		if (customer.getCustomerId() == null) {
			String customerId = UUID.randomUUID().toString();
			customer.setCustomerId(customerId);
		}
		return customerDao.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerDao.findAll();
	}

	@Override
	public Customer getCustomerById(String customerId) {
		Customer customer = customerDao.findById(customerId)
				.orElseThrow(() -> new ResourceNotFoundException("Customer Not Found!" + customerId));
		return customer;
	}

	@Override
	public Customer updateCustomerDetails(Customer customer, String customerId) {
		customer.setCustomerId(customerId);
		return customerDao.save(customer);
	}

	@Override
	public void deleteCustomer(String customerId) {
		// TODO Auto-generated method stub
		List<Account> account = accountService.findAccountByCustomerId(customerId);
		account.forEach(acc -> {
			accountService.deleteAccount(acc.getAccountId());
		});
		customerDao.deleteById(customerId);
	}

	

}
