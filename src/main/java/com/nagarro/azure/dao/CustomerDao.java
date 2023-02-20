package com.nagarro.azure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.azure.model.Customer;


public interface CustomerDao extends JpaRepository<Customer, String> {

}
