package com.capgemini.electricityBillSystem.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.electricityBillSystem.Pojos.Connection;
import com.capgemini.electricityBillSystem.Pojos.Customer;



@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
		public List<Customer> findByFirstName(String firstName) ;
		public Customer findByMobileNumber(Long mobileNumber);
		public Customer searchCustomerByAddharNumber(Long addharNumber);
	
		
}
