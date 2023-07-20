package com.lcwd.hotel.exception;

public class ResourceNotFoundException extends RuntimeException{

	private String message;

	public ResourceNotFoundException(String message) {
		super(message);
		this.message = message;
	}

	public ResourceNotFoundException() {
		super("Resource Not Found !!");
		// TODO Auto-generated constructor stub
	}

	

	
	
	
}
