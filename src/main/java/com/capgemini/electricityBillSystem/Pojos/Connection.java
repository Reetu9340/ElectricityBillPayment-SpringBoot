package com.capgemini.electricityBillSystem.Pojos;



import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;

//@Component("connection")
//@Scope("prototype")
@Entity
@Table(name = "CONNECTION")
public class Connection implements Serializable {

	private static final long serialVersionUID = 1L;
	// should be auto-generated for internal purpose

	
	@Column(name = "CONNECTION_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long connectionId;
	
	
	@Id
	@Column(name = "CONSUMER_NUMBER")
	private Long consumerNumber;
	


	public Long getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(Long connectionId) {
		this.connectionId = connectionId;
	}

	// customerId auto-generated
	@OneToOne
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customer;
	
	 @Column
	private int flatOrHouseNumber;
	 
	 @Column
	private String villageName;
	 @Column
	private String districtName;
	 
	 @Column
	private String state;
	 
	 @Column
	private Long pincode;
	

	@Column(name = "CONNECTION_TYPE")
	@Enumerated(EnumType.STRING)
	private ConnectionType connectionType;

	@Column(name = "APPLICATION_DATE", length = 10, nullable = false)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate applicationDate;

	@Column(name = "CONNECTION_DATE", length = 10, nullable = false)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate connectionDate;

	/* validation */

	@Column(name = "STATUS", nullable = false, columnDefinition = "varchar(15) Check(status IN ('active','inactive'))")
//    @Pattern(regexp = "^[A|I]{1}$", message ="Must be Active or Inactive")
//    @Pattern(regexp = "^Active$|^Inactive$", message = "allowed input: active or inactive")
	private String connectionStatus;

	public Long getConsumerNumber() {
		return consumerNumber;
	}

	public void setConsumerNumber(Long consumerNumber) {
		this.consumerNumber = consumerNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getFlatOrHouseNumber() {
		return flatOrHouseNumber;
	}

	public void setFlatOrHouseNumber(int flatOrHouseNumber) {
		this.flatOrHouseNumber = flatOrHouseNumber;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public ConnectionType getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(ConnectionType connectionType) {
		this.connectionType = connectionType;
	}

	public LocalDate getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}

	public LocalDate getConnectionDate() {
		return connectionDate;
	}

	public void setConnectionDate(LocalDate connectionDate) {
		this.connectionDate = connectionDate;
	}

	public String getConnectionStatus() {
		return connectionStatus;
	}

	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Connection(Long consumerNumber, Customer customer, int flatOrHouseNumber, String villageName,
			String districtName, String state, Long pincode, ConnectionType connectionType, LocalDate applicationDate,
			LocalDate connectionDate, String connectionStatus) {
		super();
		this.consumerNumber = consumerNumber;
		this.customer = customer;
		this.flatOrHouseNumber = flatOrHouseNumber;
		this.villageName = villageName;
		this.districtName = districtName;
		this.state = state;
		this.pincode = pincode;
		this.connectionType = connectionType;
		this.applicationDate = applicationDate;
		this.connectionDate = connectionDate;
		this.connectionStatus = connectionStatus;
	}

	public Connection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	


	
}