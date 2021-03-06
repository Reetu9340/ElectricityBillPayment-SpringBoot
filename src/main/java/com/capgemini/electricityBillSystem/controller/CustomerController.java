package com.capgemini.electricityBillSystem.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.electricityBillSystem.Pojos.Customer;
import com.capgemini.electricityBillSystem.exception.DuplicateCustomerException;
import com.capgemini.electricityBillSystem.exception.NoSuchCustomerException;
import com.capgemini.electricityBillSystem.service.CustomerService;




@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "*")
public class CustomerController {

	private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);


	@Autowired
	private CustomerService customerService;
	//@Autowired
	//private AddressRespository  addressRespository ;

	// http://localhost:8082/customer/addCustomer
	@PostMapping("/addCustomer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) throws DuplicateCustomerException {
		LOG.info("Controller register"+ customer.toString());
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "User registered successfully.");
		return new ResponseEntity<Customer>(customerService.addCustomer(customer), headers, HttpStatus.CREATED);
	}



	@GetMapping("/id/{customerId}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable(name = "customerId") int customerId) throws NoSuchCustomerException {
		LOG.info("getCustomerById");
		Customer customername = customerService.viewCustomerProfile(customerId); // line
		LOG.info(customername.toString());
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This customer is available in the database.");
		LOG.info(headers.toString());
		ResponseEntity<Customer> response = new ResponseEntity<Customer>(customername, headers, HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/all")
	public List<Customer> getAllCustomer() {
		LOG.info("getAllCustomer"); // in normal block
//		LOG.debug("getAllCustomer"); // in debug mode 
		return customerService.getAllCustomer();
	}
	
	// http://localhost:8080/modifyCustomer
			@PutMapping("/modifyCustomer")
			public Customer updateCustomer(@RequestBody Customer customer) throws NoSuchCustomerException {
				System.out.println("Controller updateCustomer");
				return customerService. modifyCustomer(customer);
			}
    

	@GetMapping("/getbyname/{email}")
	public List<Customer> getCustomerEmail(@PathVariable String email) throws NoSuchCustomerException {
		LOG.info("getByemail");
		return customerService.searchCustomerByEmail(email);
	}

/*	@GetMapping("/getcustomerbyAddhar/{aadharNumber}")
	public ResponseEntity<Customer> getAddharNumber(@PathVariable(name = "aadharNumber") Long aadharNumber) throws NoSuchCustomerException {
		LOG.info("getCustomerByAddhar");
		Customer customername = customerService.searchCustomerByAaddhar(aadharNumber); // line
		LOG.info(customername.toString());
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This customer is available in the database.");
		LOG.info(headers.toString());
		ResponseEntity<Customer> response = new ResponseEntity<Customer>(customername, headers, HttpStatus.OK);
		return response;
	}*/

	/*@GetMapping("/getbyname/{firstName}")
	public List<Customer> getCustomerByFirstName(@PathVariable String firstName) throws NoSuchCustomerException {
		LOG.info("getEmpByFirstName");
		return customerService.searchCustomerByName(firstName);
	}*/
	/*@GetMapping("/getbymobile/{mobileNumber}")
	public List<Customer> getCustomerByMobile(@PathVariable Long mobileNumber) throws NoSuchCustomerException {
		LOG.info("getEmpByMobileNumber");
		HttpHeaders headers = new HttpHeaders();
		ResponseEntity<Customer> response = new ResponseEntity<Customer>(headers, HttpStatus.OK);
		return (List<Customer>) customerService.searchCustomerByMobile(mobileNumber);
		}*/


}
