package com.capgemini.electricityBillSystem.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.electricityBillSystem.Pojos.Bill;
import com.capgemini.electricityBillSystem.exception.NoSuchConnectionException;
import com.capgemini.electricityBillSystem.exception.NoSuchDateRangeException;
import com.capgemini.electricityBillSystem.exception.NoSuchEmailException;
import com.capgemini.electricityBillSystem.exception.NoSuchMobileNumberException;





public interface BillService {
	
	public List<Bill> getAllBill();

	public Bill getBillById(Long billId) throws NoSuchConnectionException;

	
	public List<Bill> viewBillByConsumerNumber(Long consumerNumber) throws NoSuchConnectionException;

	public Bill viewBillByMobileNumber(Long mobileNumber) throws NoSuchMobileNumberException;

	public Bill viewBillByEmail(String email) throws NoSuchEmailException;

	public List<Bill> viewBillForDateRange(LocalDate from, LocalDate to) throws NoSuchDateRangeException;

	

}
