package com.example.demo.Exception;

public class EmployeeAlreadyExistexception extends RuntimeException{
	  private String message;
	public EmployeeAlreadyExistexception(String message) {
		super();
		this.message = message;
	}
}