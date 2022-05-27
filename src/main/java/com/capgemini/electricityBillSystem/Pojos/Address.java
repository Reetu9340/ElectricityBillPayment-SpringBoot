//package com.capgemini.electricityBillSystem.Pojos;
//
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//
//@Entity
//public class Address {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long addressId;
//	
//	@Column(name="flat_number" , length=25)
//	private int flatOrHouseNumber;
//	
//	@Column(name="building_name" , length=25)
//	private String buildingName;
//	
//	@Column(name="land_mark" , length=25)
//	private String landmark;
//	
//	@Column(name="village" , length=25)
//	private String village;
//	
//	@Column(name="taluka" , length=25)
//	private String taluka;
//	
//	public Long getAddressId() {
//		return addressId;
//	}
//
//	public void setAddressId(Long addressId) {
//		this.addressId = addressId;
//	}
//
//	public int getFlatOrHouseNumber() {
//		return flatOrHouseNumber;
//	}
//
//	public void setFlatOrHouseNumber(int flatOrHouseNumber) {
//		this.flatOrHouseNumber = flatOrHouseNumber;
//	}
//
//	public String getBuildingName() {
//		return buildingName;
//	}
//
//	public void setBuildingName(String buildingName) {
//		this.buildingName = buildingName;
//	}
//
//	public String getLandmark() {
//		return landmark;
//	}
//
//	public void setLandmark(String landmark) {
//		this.landmark = landmark;
//	}
//
//	public String getVillage() {
//		return village;
//	}
//
//	public void setVillage(String village) {
//		this.village = village;
//	}
//
//	public String getTaluka() {
//		return taluka;
//	}
//
//	public void setTaluka(String taluka) {
//		this.taluka = taluka;
//	}
//
//	public String getDistrictName() {
//		return districtName;
//	}
//
//	public void setDistrictName(String districtName) {
//		this.districtName = districtName;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public String getPincode() {
//		return pincode;
//	}
//
//	public void setPincode(String pincode) {
//		this.pincode = pincode;
//	}
//
//	@Column(name="district" , length=25)
//	private String districtName;
//	
//	@Column(name="state" , length=25)
//	private String state;
//	
//	@Column(name="pincode" , length=25)
//	private String pincode;
//	
//	public Address() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//
//}
