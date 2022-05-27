package com.capgemini.electricityBillSystem.Pojos;

import java.time.LocalDate;

public class ConnectionDto {
	
	private Long consumerNumber;
	
	private int customerId;

	private int flatOrHouseNumber;
	
	private String villageName;

	private String districtName;
	
	private String state;
	
	private Long pincode;
	
	private ConnectionType connectionType;
	
	private LocalDate applicationDate;
	
	private LocalDate connectionDate;
	
	private String connectionStatus;
	
	

	public Long getConsumerNumber() {
		return consumerNumber;
	}

	public void setConsumerNumber(Long consumerNumber) {
		this.consumerNumber = consumerNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public ConnectionDto(Long consumerNumber, int customerId, int flatOrHouseNumber, String villageName,
			String districtName, String state, Long pincode, ConnectionType connectionType, LocalDate applicationDate,
			LocalDate connectionDate, String connectionStatus) {
		super();
		this.consumerNumber = consumerNumber;
		this.customerId = customerId;
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

	public ConnectionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}