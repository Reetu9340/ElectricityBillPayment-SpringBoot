package com.capgemini.electricityBillSystem.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.electricityBillSystem.Pojos.Customer;
import com.capgemini.electricityBillSystem.exception.DuplicateCustomerException;
import com.capgemini.electricityBillSystem.exception.NoSuchCustomerException;
import com.capgemini.electricityBillSystem.repository.CustomerRepo;

@Service
public class CustomerServiceImpl  implements CustomerService{
	
	private static final Logger LOG = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Autowired
	CustomerRepo customerRepo ;
	
	
	@Override
	public Customer addCustomer(Customer customer) throws DuplicateCustomerException {
		LOG.info("add");
		if (null != customerRepo.findById(customer.getCustomerId()))
			return customerRepo.save(customer);
		throw new  DuplicateCustomerException ("This customer is already registered");
	}

	@Override
	public Customer viewCustomerProfile(int CustomerId) throws NoSuchCustomerException {
		LOG.info("getCustomerById");
		Optional<Customer> empOpt = customerRepo.findById(CustomerId);
		if (empOpt.isPresent()) {
			LOG.info("Customer is available.");
			return empOpt.get();
		} else {
			LOG.info("customer is NOT available.");
			throw new NoSuchCustomerException(CustomerId + " this customer is not found.");
		}
	}

	@Override
	public Customer editCustomerProfile(int customerId) throws NoSuchCustomerException {
		return null;
	}

@Override
public Customer searchCustomerByCustomerId(Long customerId) throws NoSuchCustomerException {	
	return null;
}

@Override
public List<Customer> searchCustomerByEmail(String email) throws NoSuchCustomerException {
	LOG.info("get customer by email");
	return  ((CustomerService) customerRepo).searchCustomerByEmail(email);
}



@Override
public Customer searchCustomerByMobile(Long mobileNumber) throws NoSuchCustomerException {
	LOG.info("getCustomerByMobile");
	return customerRepo.findByMobileNumber(mobileNumber);
}

@Override
public List<Customer> searchCustomerByName(String firstName) throws NoSuchCustomerException {
	LOG.info("getCustomerByFirstName");
	return customerRepo.findByFirstName(firstName);
}

@Override
public Customer searchCustomerByAddhar(Long addharNumber) {
	LOG.info("getCustomerByAddharNumber");
	return customerRepo.searchCustomerByAddharNumber(addharNumber);
}

@Override
public List<Customer> getAllCustomer() {
		System.out.println("Service getAllCustomer");
		return customerRepo.findAll(); 
	}

@Override
public Customer modifyCustomer(Customer customer) throws NoSuchCustomerException  {

	LOG.info("Service Modify Customer");
	if (customerRepo.existsById(customer.getCustomerId())) {
		return customerRepo.save(customer);
	} else {
		LOG.error("Customer does not exist.");
		throw new NoSuchCustomerException(customer.getCustomerId() + "does not exits");
	}
}


}