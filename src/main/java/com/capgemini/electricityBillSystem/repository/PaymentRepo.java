//package com.capgemini.electricityBillSystem.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.capgemini.electricityBillSystem.Pojos.Payment;
//import com.capgemini.electricityBillSystem.Pojos.PaymentStatus;
//
//	@Repository
//	public interface PaymentRepo extends JpaRepository<Payment, Long>{
//
//		
//		public abstract List<Payment> getListBycustomerId(Long customerId);
//
//		public abstract PaymentStatus payBill(Payment payment);
//
//		public abstract List<Payment> viewHistoricalPayment(Long consumerNumber);
//
//		public abstract Payment getPaymentById(Long paymentId);
//
//		public abstract List<Payment> getAllPayments();
//
//
//
//}
