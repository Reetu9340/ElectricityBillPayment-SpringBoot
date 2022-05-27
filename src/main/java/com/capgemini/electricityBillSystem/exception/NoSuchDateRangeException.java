package com.capgemini.electricityBillSystem.exception;

public class NoSuchDateRangeException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public NoSuchDateRangeException(String message) {
		super(message);
	}

}
