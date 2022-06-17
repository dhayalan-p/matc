package com.example.demo.Exception;

public class EmployeeNotFoundexception extends RuntimeException{
	  private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EmployeeNotFoundexception(String message) {
		super();
		this.message = message;
	}
	
		
		
	
	
	}


