//package com.capgemini.electricityBillSystem.controller;
//
//import java.util.List;
//
//import javax.transaction.InvalidTransactionException;
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.capgemini.electricityBillSystem.Pojos.Payment;
//import com.capgemini.electricityBillSystem.Pojos.PaymentStatus;
//import com.capgemini.electricityBillSystem.exception.NoSuchCustomerException;
//import com.capgemini.electricityBillSystem.service.PaymentServiceImpl;
//
//@Component
//@RestController
//@RequestMapping("/payment")
//
//public class PaymentController {
//
//
//
//	@Autowired
//	private PaymentServiceImpl paymentService;
//	
//	@GetMapping("/getpaymentbyId/{paymentId}")
//	public ResponseEntity<Payment>getPaymentById(@PathVariable(name = "paymentId")long paymentId) throws NoSuchCustomerException {
//		
//		Payment pay = paymentService.getPaymentById(paymentId); 
//		
//		ResponseEntity<Payment> response = new ResponseEntity<Payment>(pay,HttpStatus.OK);
//		return response;
//	}
//	
//	@PostMapping("/registerbill")
//	public ResponseEntity<PaymentStatus>  RegisterBill(@Valid @RequestBody Payment payment) throws InvalidTransactionException{
//	
//		PaymentStatus pay = paymentService.payBill(payment);
//		
//		ResponseEntity<PaymentStatus> response = new ResponseEntity<PaymentStatus>(pay, HttpStatus.OK);
//		return response;
//	}
//	
//	
//	 @GetMapping("/getallpayment")
//		public List<Payment> getAllPayment() {
//			return paymentService.getAllPayments();
//		}
//	 
//	 
//	@GetMapping("/readhistoricalpayment/{customerId}")
//	public ResponseEntity<List<Payment>> getListByFarmerId(@PathVariable(name="customerId")long customerId) throws NoSuchCustomerException	{
//		
//			ResponseEntity<List<Payment>> response = null;
//			List<Payment> list = paymentService.viewHistoricalPayment(customerId);
//		
//			response = new ResponseEntity<List<Payment>>(list, HttpStatus.CREATED);
//			return response;
//	}
//
//}
