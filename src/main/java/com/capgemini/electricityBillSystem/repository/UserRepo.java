package com.capgemini.electricityBillSystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.electricityBillSystem.Pojos.User;

public interface UserRepo extends JpaRepository<User, Long>
{

//	List<User> findByLogin(String name, String password);

	public abstract User findByUserName(String userName);

	
}

