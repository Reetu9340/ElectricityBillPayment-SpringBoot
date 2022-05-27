package com.cg.spring.boot.demo.Controller;

import com.capgemini.electricityBillSystem.Pojos.Customer;
import com.capgemini.electricityBillSystem.Pojos.User;
import com.capgemini.electricityBillSystem.exception.DuplicateUserException;
import com.capgemini.electricityBillSystem.exception.InvalidLoginCredentialException;
import com.capgemini.electricityBillSystem.exception.NoSuchUserException;

public interface ICustomerRepository {
	//package com.cg.spring.boot.demo.service;

	

	public interface IcustomerService {
		
		public User registerUser(User user) throws DuplicateUserException;
		public User loginUser(User user) throws InvalidLoginCredentialException;
		public String logout(String userName) throws NoSuchUserException;
		public User changePassword(User user) throws InvalidLoginCredentialException;
//		public void forgotPassword(String userName);
		public User searchUserByUserName(String userName)throws NoSuchUserException;
		public User searchUserByUserId(long userId)throws NoSuchUserException;
		


	}

	public Customer findByCustomerId(int i);

}



