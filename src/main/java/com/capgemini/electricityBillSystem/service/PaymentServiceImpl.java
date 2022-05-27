//
//package com.capgemini.electricityBillSystem.service;
//
//import java.util.List;
//
//import javax.transaction.InvalidTransactionException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.capgemini.electricityBillSystem.Pojos.Payment;
//import com.capgemini.electricityBillSystem.Pojos.PaymentStatus;
//import com.capgemini.electricityBillSystem.repository.PaymentRepo;
//
//
//
//	@Service
//	public class PaymentServiceImpl implements PaymentService {
//		
//		@Autowired
//		private PaymentServiceImpl paymentService;
//		
//		@Autowired
//		private PaymentRepo paymentRepo;
//
//		
//		@Override
//		public List<Payment> viewHistoricalPayment(Long consumerNumber) {
//			return paymentRepo.viewHistoricalPayment(consumerNumber);
//		}
//
//		@Override
//		public Payment getPaymentById(Long paymentId){
//			
//			return paymentRepo.getPaymentById(paymentId);
//		}
//
//		@Override
//		public List<Payment> getAllPayments() {
//			return paymentRepo.getAllPayments();
//		}
//
//		@Override
//		public PaymentStatus payBill(Payment payment) {
//			// TODO Auto-generated method stub
//			return paymentRepo.payBill(payment);
//		}
//		
////		@Override
////		public PaymentStatus payBill(Payment payment){
////			
////			boolean pay = paymentRepo.existsById(payment.getPaymentId());
////			if(pay) {
////				
////				return ((paymentRepo.save(payment)).getPaymentStatus());
////			}
////			else {
////				
////				throw new InvalidTransactionException("Payment is failed due to Invalid details");
////			}
////		}
//
//}
