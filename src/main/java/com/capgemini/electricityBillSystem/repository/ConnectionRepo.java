package com.capgemini.electricityBillSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.electricityBillSystem.Pojos.Connection;


@Repository
public interface ConnectionRepo extends JpaRepository<Connection, Long> {

public List<Connection> getByPincode(Long pincode);

public Object findByConsumerNumber(Long consumerNumber);

public Object findBillByConsumerNumber(Long consumerNumber);

//public Optional<Connection> findById(int pincode);

//public Object findBillByConsumerNumber(Long consumerNumber);
  
// public Optional<Connection> getConnectionByCustomerId(int connectionId);

}

