package com.customer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.customer.entities.Customer;
import com.customer.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public void createCustomerInformation(Customer customer) {
		customerRepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepo.findAll();
	}

	@Override
	public Customer getOneCustomer(String uidNumber) {
		Optional<Customer> findById = customerRepo.findById(uidNumber);
		Customer customer = findById.get();
		return customer;

	}

	@Override
	public void deleteOneCustomerDetails(String uidNumber) {
		customerRepo.deleteById(uidNumber);
	}

	@Override
	public Page<Customer> getCustomers(Integer page,Integer pageSize) {
		Pageable paging = PageRequest.of(page, pageSize);
		
		Page<Customer> pagedResult = customerRepo.findAll(paging);

		return pagedResult;
	}

}