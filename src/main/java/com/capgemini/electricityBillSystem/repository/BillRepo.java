//package com.capgemini.electricityBillSystem.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import com.capgemini.electricityBillSystem.Pojos.Bill;
//
//
//public interface BillRepo extends JpaRepository<Bill, Long>{
//
//
//	@Query(value="SELECT * FROM bill where customer = (select customer_id from customer where billId = ?1)", nativeQuery=true )
//	public Bill getBillById(Long billId);
//
//	@Query(value="SELECT * FROM bill where customer = (select customer_id from customer where consumerNumber = ?1)", nativeQuery=true )
//	public List<Bill> viewBillByConsumerNumber(Long consumerNumber);
//
//	@Query(value="SELECT * FROM bill where customer = (select customer_id from customer where mobileNumber = ?1)", nativeQuery=true )
//	public List<Bill> viewBillByMobileNumber(Long mobileNumber);
//
////	@Query(value = "SELECT * FROM Bill WHERE billDate BETWEEN :from AND :to")
////	public List<Bill> readBillForDateRange(@Param("from") LocalDate from, @Param("to") LocalDate to);
////
////	@Query(value="SELECT * FROM bill where customer = (select customer_id from customer where email = ?1)", nativeQuery=true )
////	public Bill viewBillByEmail(String email);
//	
////	public Bill viewBillByConsumerNumber(Long ConsumerNumber);
////	public Bill viewBillByMobileNumber(String mobileNumber);
////	public Bill viewBillByEmail(String email);
////	public List<Bill>viewBillByDateRange(Long consumerNumber);
////	public double energyBillCalculator(ConnectionType connectionType ,double calculator);
////	public void emailBillToConstomer(Long customer,String email);;
//
//}
