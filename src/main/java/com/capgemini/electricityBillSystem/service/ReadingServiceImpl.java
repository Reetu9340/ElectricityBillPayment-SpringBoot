package com.capgemini.electricityBillSystem.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.electricityBillSystem.Pojos.Reading;
import com.capgemini.electricityBillSystem.exception.NoSuchConnectionException;
import com.capgemini.electricityBillSystem.repository.ConnectionRepo;
import com.capgemini.electricityBillSystem.repository.ReadingRepository;


@Service
public class ReadingServiceImpl implements ReadingService {
	@Autowired
	private ReadingRepository readingRepository;
	
	@Autowired
	private ConnectionRepo connectionRepository;
	
	private Logger LOG = LoggerFactory.getLogger(ReadingServiceImpl.class);

	 @Override
	public Reading SubmitReading(Reading reading) throws NoSuchConnectionException{
			LOG.info("register");
//			if (null == readingRepository.findById(reading.getReadingId()))
				return readingRepository.save(reading);
//			throw new  NoSuchConnectionException ("This reading is already submitted");
		}


	@Override
	public List<Reading> getreadMeterReadingByConsumerNumber(Long consumerNumber) throws NoSuchConnectionException {
		// TODO Auto-generated method stub
		LOG.info("getreadMeterReadingByConsumerNumber");
		if(connectionRepository.findByConsumerNumber(consumerNumber)!=null)
		return readingRepository.findByConnection_consumerNumber(consumerNumber);
			throw new NoSuchConnectionException(consumerNumber + " this consumerNumber is not found.");
		}
			
	
		
//	@Override
//	public Reading getReadingById(int readingId) throws NoSuchConnectionException {
//		
//		LOG.info("getreadingIdById");
//			Optional<Reading> reading = readingRepository.findById(readingId);
//			if (reading.isPresent()) {
//				LOG.info("reading is available.");
//				return reading.get();
//			} else {
//				LOG.error("reading is NOT available.");
//				throw new NoSuchConnectionException(readingId + " this reading is not found.");
//			}
//	}
	@Override
	public Reading getReadingById(int readingId) throws NoSuchConnectionException {
		LOG.info("getReadingIdById");
			Optional<Reading> reading = readingRepository.findById(readingId);
			if (reading.isPresent()) {
				LOG.info("Reading is available.");
				return reading.get();
			} else {
				LOG.error("reading is NOT available.");
				throw new NoSuchConnectionException(readingId + " this reading is not found.");
			}		

	}	
	
	 @Override
	  public List<Reading>getAllReading() {
			System.out.println("Service getAllReading");
			return readingRepository.findAll();
		}


	@Override
	public List<Reading> findByConnection_consumerNumber(Long consumerNumber) {
		// TODO Auto-generated method stub
		return readingRepository.findByConnection_consumerNumber(consumerNumber);
	}
	




	

}