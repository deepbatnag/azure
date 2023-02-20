package com.nagarro.azure.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.azure.model.Account;
import com.nagarro.azure.service.AccountService;

@Service
public class AccountServiceImplementation implements AccountService {

	@Override
	public void deleteAccount(String accountId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Account> findAccountByCustomerId(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
