package com.cg.spring.boot.demo.Controller;

import java.util.List;

import com.capgemini.electricityBillSystem.Pojos.Connection;
import com.capgemini.electricityBillSystem.exception.NoSuchConnectionException;

public interface IConnectionRepository {
	


	public interface IConnectionService {
		
		public Connection newConnectionRequest(Connection newConnection) throws NoSuchConnectionException;
		public Connection modifyConnectionAddress(Connection connection);
		public Connection modifyConnection(Connection connection) throws NoSuchConnectionException;
		public List<Connection> findConnectionsByPincode(Long pincode) throws NoSuchConnectionException;
		public Connection findConnectionById(Long connectionId) throws NoSuchConnectionException;
		


	}

	public Connection findConnectionById(int i);

}



