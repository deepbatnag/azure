package com.nagarro.azure.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_details")
public class Customer {

	@Id
	private String customerId;
	private String firstName;
	private String lastName;
	private String address;
	@Column(length = 10)
	private String mobileNumber;
//	@Transient
//	private List<Account> accounts = new ArrayList<>();
//
//	public List<Account> getAccounts() {
//		return accounts;
//	}
//
//	public void setAccounts(List<Account> accounts) {
//		this.accounts = accounts;
//	}

	public Customer(String customerId, String firstName, String lastName, String address, String mobileNumber,
			List<Account> accounts) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobileNumber = mobileNumber;
//		this.accounts = accounts;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Customer(String customerId, String firstName, String lastName, String address, String mobileNumber) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", mobileNumber=" + mobileNumber + "]";
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
