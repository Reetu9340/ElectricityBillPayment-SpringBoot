package com.capgemini.electricityBillSystem.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.electricityBillSystem.Pojos.Bill;
import com.capgemini.electricityBillSystem.exception.NoSuchConnectionException;
import com.capgemini.electricityBillSystem.exception.NoSuchMobileNumberException;
import com.capgemini.electricityBillSystem.service.BillServiceImpl;




@RestController
@RequestMapping("/bill")
@CrossOrigin(origins = "*")
public class BillController {
	
	private static final Logger LOG = LoggerFactory.getLogger(BillController.class);
	
	@Autowired
	@Qualifier("bill_service")
	private BillServiceImpl billService;
	//private BillServiceImpl billServiceImpl;
	
	// http://localhost:8082/getAllBill
	@GetMapping("/getAllbill")
	public List<Bill> getAllBill() {
		LOG.info("getAllBill"); // in normal block
//		LOG.debug("getAllEmps"); // in debug mode 
		return billService.getAllBill();
	}
	
	
	// http://localhost:8082/getBillbyId/{billId}
		@GetMapping("/getBillbyId/{billId}")
		public ResponseEntity<Bill>getBillById(@PathVariable(name = "billId")Long billId) throws NoSuchConnectionException {
			LOG.info("getBillById");
			Bill bill = billService.getBillById(billId); 
			LOG.info(bill.toString());
			HttpHeaders headers = new HttpHeaders();
			headers.add("message", "This bill is available in the database.");
			LOG.info(headers.toString());
			ResponseEntity<Bill> response = new ResponseEntity<Bill>(bill,headers,HttpStatus.OK);
			return response;
		}
	
	// http://localhost:8082/viewBillByConsumerNumber/
	@GetMapping(path = "/viewBillByConsumerNumber/{consumerNumber}")
	public ResponseEntity<Bill> viewBillByConsumerNumber(@PathVariable(name = "consumerNumber")Long consumerNumber) throws NoSuchConnectionException {
		LOG.info("viewBillByConsumerNumber");
		List<Bill> bill= billService.viewBillByConsumerNumber(consumerNumber); 
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This bill is available in the database ");
		LOG.info(headers.toString());
		ResponseEntity<Bill> response = new ResponseEntity<Bill>((Bill) bill.get(0), headers, HttpStatus.OK);
		return response;
	}
	

	
	// http://localhost:8082/viewBillByMobileNumber/
	@GetMapping("/viewBillByMobileNumber/{mobileNumber}")
	public ResponseEntity<Bill> viewBillByMobileNumber(@PathVariable(name = "mobileNumber")Long mobileNumber) throws NoSuchMobileNumberException {
		LOG.info("viewBillByMobileNumber");
		Bill bill = billService.viewBillByMobileNumber(mobileNumber);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This bill is available in the database ");
		LOG.info(headers.toString());
		ResponseEntity<Bill> response = new ResponseEntity<Bill>(bill, headers, HttpStatus.OK);
		return response;
	}
	
/*	// http://localhost:8082/viewBillByEmail/
	@GetMapping("/viewBillByEmail/{email}")
	public ResponseEntity<Bill> viewBillByEmail(@PathVariable(name = "email")String email) throws NoSuchEmailException {
		LOG.info("viewBillByEmail");
		Bill bill = billService.viewBillByEmail(email);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This bill is available in the database ");
		LOG.info(headers.toString());
		ResponseEntity<Bill> response = new ResponseEntity<Bill>(bill, headers, HttpStatus.OK);
		return response;
	}
	
	*/
	
//	// http://localhost:8082/getbydatebet/2021-10-01/2021-11-01
//	@GetMapping(path = "/getbydatebet/from:{from}/to:{to}")
//	public ResponseEntity<List<Bill>> readBillForDateRange(@PathVariable("from") String from,
//			@PathVariable("to") String to) throws NoSuchDateRangeException {
//		LOG.info("readBillForDateRange");
//		  
//	        LocalDate fromDate = LocalDate.parse(from, DateTimeFormatter.ISO_DATE);
//	        LocalDate toDate = LocalDate.parse(to, DateTimeFormatter.ISO_DATE);		  
//		  
//		ResponseEntity<List<Bill>> response = null;
////		List<Bill> list = billService.viewBillForDateRange(from, to);
//		List<Bill> list = billService.viewBillForDateRange(fromDate, toDate);
//		response = new ResponseEntity<List<Bill>>(list, HttpStatus.OK);
//		return response;
//		
//	}
	

}
