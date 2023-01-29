package com.customer.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.customer.entities.Customer;


public interface CustomerService {
	
	public void createCustomerInformation(Customer customer);
	public List<Customer> getAllCustomers();

	public Customer getOneCustomer(String uidNumber);

	public void deleteOneCustomerDetails(String uidNumber);
	
	public Page<Customer> getCustomers(Integer page,Integer pageSize);
}
