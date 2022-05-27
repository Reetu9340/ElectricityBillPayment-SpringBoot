//package com.capgemini.electricityBillSystem.Pojos;
//
//import java.time.LocalDate;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//import org.hibernate.loader.entity.CacheEntityLoaderHelper.EntityStatus;
//
//@Entity
//public class Payment {
//
//	@Id
//	@GeneratedValue(strategy =  GenerationType.IDENTITY)
//	private long paymentId;
//	
//	private LocalDate paymentDate;
//	
//	private double latePaymentCharges;
//	
//	private double totalPaid;
//	
//	private EntityStatus paymentStatus;
//	
//	public Payment() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public long getPaymentId() {
//		return paymentId;
//	}
//
//	public void setPaymentId(long paymentId) {
//		this.paymentId = paymentId;
//	}
//
//	public LocalDate getPaymentDate() {
//		return paymentDate;
//	}
//
//	public void setPaymentDate(LocalDate paymentDate) {
//		this.paymentDate = paymentDate;
//	}
//
//	public double getLatePaymentCharges() {
//		return latePaymentCharges;
//	}
//
//	public void setLatePaymentCharges(double latePaymentCharges) {
//		this.latePaymentCharges = latePaymentCharges;
//	}
//
//	public double getTotalPaid() {
//		return totalPaid;
//	}
//
//	public void setTotalPaid(double totalPaid) {
//		this.totalPaid = totalPaid;
//	}
//
//	public void setPaymentStatus(EntityStatus paymentStatus) {
//		this.paymentStatus = paymentStatus;
//	}
//
//
//}
