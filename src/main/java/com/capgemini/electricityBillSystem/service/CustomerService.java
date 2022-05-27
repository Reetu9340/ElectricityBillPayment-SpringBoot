package com.capgemini.electricityBillSystem.service;

import java.util.List;

import com.capgemini.electricityBillSystem.Pojos.Customer;
import com.capgemini.electricityBillSystem.exception.DuplicateCustomerException;
import com.capgemini.electricityBillSystem.exception.NoSuchCustomerException;


public interface CustomerService {
	public Customer addCustomer(Customer customer)throws DuplicateCustomerException;
	
	public Customer viewCustomerProfile(int customerId)throws NoSuchCustomerException;
	
	public Customer searchCustomerByCustomerId(Long customerId)throws NoSuchCustomerException;
	
	public List<Customer> searchCustomerByEmail(String email)throws NoSuchCustomerException;
	
	public Customer searchCustomerByAddhar(Long addharNumber)throws NoSuchCustomerException;
	
	public Customer searchCustomerByMobile(Long mobileNumber)throws NoSuchCustomerException;
	
	public List<Customer> searchCustomerByName(String firstName)throws NoSuchCustomerException;
	
	public Customer editCustomerProfile(int customerId) throws NoSuchCustomerException;
	
	public List<Customer> getAllCustomer();
	
	public Customer modifyCustomer(Customer customer) throws NoSuchCustomerException;

}
