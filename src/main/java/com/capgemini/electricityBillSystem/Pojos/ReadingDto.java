package com.capgemini.electricityBillSystem.Pojos;

import java.time.LocalDate;

public class ReadingDto {
	
	private int readingId;
	
	private int connectionId;
	
	private int unitsConsumed;
	
	private Long reading;
	
	private LocalDate readingDate;
	
	private int pricePerUnits;

	public ReadingDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReadingDto(int readingId, int connectionId, int unitsConsumed, Long reading, LocalDate readingDate,
			int pricePerUnits) {
		super();
		this.readingId = readingId;
		this.connectionId = connectionId;
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

	public int getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(int connectionId) {
		this.connectionId = connectionId;
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
	

}
