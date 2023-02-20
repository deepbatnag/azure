package com.nagarro.azure.model;

import javax.persistence.Transient;

public class Account {
	private String accountId;
	private String totalAmount;
	private String customerId;
	private double updateAmount;
	private Customer customer;
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public double getUpdateAmount() {
		return updateAmount;
	}
	public void setUpdateAmount(double updateAmount) {
		this.updateAmount = updateAmount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Account(String accountId, String totalAmount, String customerId, double updateAmount, Customer customer) {
		super();
		this.accountId = accountId;
		this.totalAmount = totalAmount;
		this.customerId = customerId;
		this.updateAmount = updateAmount;
		this.customer = customer;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", totalAmount=" + totalAmount + ", customerId=" + customerId
				+ ", updateAmount=" + updateAmount + ", customer=" + customer + "]";
	}
	
	

}
