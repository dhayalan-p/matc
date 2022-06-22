package com.example.demo.Exception;

public class CustomerAlreadyExistexception extends RuntimeException{
	
     private String message;

	public CustomerAlreadyExistexception(String message) {
		super();
		this.message = message;
	}
     
     
     
}
