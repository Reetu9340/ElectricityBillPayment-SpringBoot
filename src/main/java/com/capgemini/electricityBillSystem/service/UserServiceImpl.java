package com.capgemini.electricityBillSystem.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.electricityBillSystem.Pojos.Connection;
import com.capgemini.electricityBillSystem.Pojos.Customer;
import com.capgemini.electricityBillSystem.Pojos.User;
import com.capgemini.electricityBillSystem.exception.DuplicateUserException;
import com.capgemini.electricityBillSystem.exception.InvalidLoginCredentialException;
import com.capgemini.electricityBillSystem.exception.NoSuchCustomerException;
import com.capgemini.electricityBillSystem.exception.NoSuchUserException;
import com.capgemini.electricityBillSystem.repository.UserRepo;



@Service
public class UserServiceImpl implements UserService {

	public boolean isLoggedIn;

	private User tempUser;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserRepo userRepo;

	public User registerUser(User appUser) throws DuplicateUserException {
		LOG.info("register");
		if (null == userRepo.findByUserName(appUser.getUserName()))
			return userRepo.save(appUser);
		throw new DuplicateUserException ("This user is already registered");
	}

	public User loginUser(User appUser) throws InvalidLoginCredentialException {
		LOG.info("login");
		tempUser = userRepo.findByUserName(appUser.getUserName());
		if (null != tempUser) {
			if (appUser.equals(tempUser)) {
				isLoggedIn = true;
				LOG.info("login successful");
				return tempUser;
			}
		}
		throw new InvalidLoginCredentialException("Please enter valid Credential ");

	}
	

	public String logout(String userName) throws NoSuchUserException {
		LOG.info("logout");
		if (isLoggedIn) {
			isLoggedIn = false;
			return "User logged out successfully.";
		}
		throw new NoSuchUserException (userName + "No such User found");
	}

	@Override
	public User changePassword(User user) throws InvalidLoginCredentialException {
		LOG.info("change your password");
		if (userRepo.existsById(user.getUserId())) {
			
			return userRepo.save(user);
		}
		LOG.info(user.getUserId() + " does not exist.");
		throw new InvalidLoginCredentialException(" this user is not present or invalid credebtial");
	}
	
	@Override
	public User searchUserByUserName(String userName) throws NoSuchUserException {
		LOG.info("get User By UserName");
		tempUser=userRepo.findByUserName(userName);
		if (tempUser.getUserName().equals(userName)) {
			LOG.info("User is available.");
			return tempUser;
		} else {
			LOG.info("User is NOT available.");
			throw new NoSuchUserException(userName + " this user is not found.");
		}
	}

	@Override
	public User searchUserByUserId(long userId) throws NoSuchUserException {
		
		Optional<User> Opt = userRepo.findById(userId);
		if (Opt.isPresent()) {
			return Opt.get();
		} else {
			throw new NoSuchUserException(userId + " this user is not found.");
		}
	}

	public List<User> getAllUsers() {
		System.out.println("Service getAllUsers");
		return userRepo.findAll();
	}
	
	@Override
	public User modifyUser(User user) throws NoSuchUserException  {

		LOG.info("Service Modify User");
		if (userRepo.existsById(user.getUserId())) {
			return userRepo.save(user);
		} else {
			LOG.error("User does not exist.");
			throw new NoSuchUserException(user.getUserId() + "does not exits");
		}
	}

	
	
	
}
