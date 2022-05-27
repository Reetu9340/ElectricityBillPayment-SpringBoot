package com.capgemini.electricityBillSystem.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.capgemini.electricityBillSystem.Pojos.Connection;
import com.capgemini.electricityBillSystem.exception.NoSuchConnectionException;


public interface ConnectionService {

	public Connection newConnectionRequest(Connection newConnection) throws NoSuchConnectionException;
	
	public Connection modifyConnection(Connection connection) throws NoSuchConnectionException;
	
	public Connection getConnectionById(long consumerNumber) throws NoSuchConnectionException;
	
	Connection getConnectionById(Long consumerNumber) throws NoSuchConnectionException;
	
	public List<Connection> getAllConnection();
	
//	public Connection getConnectionById(Long consumerNumber);
	
	//List<Connection> getConnectionsByPincode(int pincode) throws NoSuchConnectionException;

	//List<Connection> getConnectionsByPincode(Long pincode) throws NoSuchConnectionException;

//	@Query(value = "SELECT c FROM Reading c WHERE c.connection.pincode = ?1")
	//public List<Connection> getConnectionsByPincode(Long pincode) throws NoSuchConnectionException;
	//List<Connection> getConnectionsByPincode(int pincode) throws NoSuchConnectionException;
	//Connection getConnectionByCustomerId(int customerId) throws NoSuchConnectionException;
	
	//public Connection modifyConnectionAddress(Connection connection) throws NoSuchConnectionException;
	
//	public Connection getConnectionByCustomerId(int customerId);
	
	
	
	
	
}


