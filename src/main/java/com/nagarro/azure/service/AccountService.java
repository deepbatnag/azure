package com.nagarro.azure.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nagarro.azure.model.Account;

@Component
public interface AccountService {
	void deleteAccount(String accountId);

	List<Account> findAccountByCustomerId(String customerId);
}
