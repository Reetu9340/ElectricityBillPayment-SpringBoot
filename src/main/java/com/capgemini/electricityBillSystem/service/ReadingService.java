package com.capgemini.electricityBillSystem.service;


import java.util.List;

import com.capgemini.electricityBillSystem.Pojos.Reading;
import com.capgemini.electricityBillSystem.exception.NoSuchConnectionException;



public interface ReadingService {
	public abstract List<Reading> findByConnection_consumerNumber(Long consumerNumber);
	public Reading SubmitReading(Reading reading) throws NoSuchConnectionException;


//    public List<Reading> getReadingById(int readingId) throws NoSuchConnectionException;
	public List<Reading> getAllReading();
	public abstract List<Reading> getreadMeterReadingByConsumerNumber(Long consumerNumber) throws NoSuchConnectionException;
	public Reading getReadingById(int readingId) throws NoSuchConnectionException;
	

	
	
}
