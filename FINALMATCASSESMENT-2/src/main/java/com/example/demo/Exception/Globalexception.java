package com.example.demo.Exception;

import org.springframework.http.HttpStatus;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@RestControllerAdvice
public class Globalexception extends  ResponseEntityExceptionHandler {



	@ExceptionHandler(value = EmployeeAlreadyExistexception.class)
	@ResponseStatus(HttpStatus.NON_AUTHORITATIVE_INFORMATION)
	public @ResponseBody ErrorResponce handlExceptions(EmployeeAlreadyExistexception ex) {
		return new ErrorResponce(
				HttpStatus.NOT_FOUND.value(), "CustomerAlreadyExists");

	}

	@ExceptionHandler(value
			= EmployeeNotFoundexception.class)
	@ResponseStatus(HttpStatus.NON_AUTHORITATIVE_INFORMATION)
	public @ResponseBody ErrorResponce handleException(EmployeeNotFoundexception ex)
	{
		return new ErrorResponce(
				HttpStatus.BAD_REQUEST.value(), "EmployeeNotfound");
	}


}
