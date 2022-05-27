package com.capgemini.electricityBillSystem.service;



import java.util.List;

import com.capgemini.electricityBillSystem.Pojos.User;
import com.capgemini.electricityBillSystem.exception.DuplicateUserException;
import com.capgemini.electricityBillSystem.exception.InvalidLoginCredentialException;
import com.capgemini.electricityBillSystem.exception.NoSuchCustomerException;
import com.capgemini.electricityBillSystem.exception.NoSuchUserException;



public interface UserService {
	

	public List<User> getAllUsers();
	public User registerUser(User user) throws DuplicateUserException;
	public User loginUser(User user) throws InvalidLoginCredentialException;
	public String logout(String userName) throws NoSuchUserException;
	public User changePassword(User user) throws InvalidLoginCredentialException;
	public User searchUserByUserName(String userName)throws NoSuchUserException;
	public User searchUserByUserId(long userId)throws NoSuchUserException;
	public User modifyUser(User user) throws NoSuchUserException;
	
}
