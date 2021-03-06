package com.capgemini.electricityBillSystem.Pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reading_table")
public class Reading {
	// should be auto-generated

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int readingId;
	
	
//	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinColumn(name ="connectionId")
//	private Connection readingForConnection;
	
	@OneToOne
	@JoinColumn(name = "CONSUMER_NUMBER", referencedColumnName = "CONSUMER_NUMBER")
	private Connection connection;
	
//	@ManyToOne
//	@JoinColumn(name = "billId")
//	private Bill bill;
//	
	
	
	@Column
	private int unitsConsumed;
	// you have to decide either to store path of meter reading photo or to store
	// meter reading photo
	@Column
	private Long reading;
	
//	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinColumn(name = "readingDate", referencedColumnName = "date")
	@Column
	private LocalDate readingDate;

	
	// should be pre-populated based on connection type and other parameter
	@Column
	private int pricePerUnits;


	public Reading() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Reading(int readingId, Connection connection, int unitsConsumed, Long reading, LocalDate readingDate,
			int pricePerUnits) {
		super();
		this.readingId = readingId;
		this.connection = connection;
		this.unitsConsumed = unitsConsumed;
		this.reading = reading;
		this.readingDate = readingDate;
		this.pricePerUnits = pricePerUnits;
	}


	public int getReadingId() {
		return readingId;
	}


	public void setReadingId(int readingId) {
		this.readingId = readingId;
	}


	public Connection getConnection() {
		return connection;
	}


	public void setConnection(Connection connection) {
		this.connection = connection;
	}


	public int getUnitsConsumed() {
		return unitsConsumed;
	}


	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}


	public Long getReading() {
		return reading;
	}


	public void setReading(Long reading) {
		this.reading = reading;
	}


	public LocalDate getReadingDate() {
		return readingDate;
	}


	public void setReadingDate(LocalDate readingDate) {
		this.readingDate = readingDate;
	}


	public int getPricePerUnits() {
		return pricePerUnits;
	}


	public void setPricePerUnits(int pricePerUnits) {
		this.pricePerUnits = pricePerUnits;
	}


	@Override
	public String toString() {
		return "Reading [readingId=" + readingId + ", connection=" + connection + ", unitsConsumed=" + unitsConsumed
				+ ", reading=" + reading + ", readingDate=" + readingDate + ", pricePerUnits=" + pricePerUnits + "]";
	}
	
	

}