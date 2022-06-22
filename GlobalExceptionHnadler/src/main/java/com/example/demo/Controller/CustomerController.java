package com.example.demo.Controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Exception.CustomernotfoundException;
import com.example.demo.Exception.CustomerAlreadyExistexception;
import com.example.demo.Model.Customer;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Service.CustomerService;
@RestController
public class CustomerController {
	
	@Autowired
private CustomerService customerservice;
	
	
	
	

	@Autowired
	private CustomerRepository customerrepository;

	@GetMapping("/getCustomer/{id}") 
	public   Customer getCustomer(@PathVariable("id") int cusid) {
		
		return customerservice.getCustomer(cusid);
				 
	    }
		
	

	@PostMapping("/addCustomer")

	public String addcustomer(@RequestBody Customer customer){
		
		
		Optional<Customer> existingCustomer
        =  customerrepository.findById(customer.getCusid());
              
		System.out.println(customer.getCusid());
		System.out.println(existingCustomer);
              if (existingCustomer.isEmpty()) {
                  customerrepository.save(customer);
                  return "Customer added successfully";
              }
              else
                  throw new CustomerAlreadyExistexception(
                      "Customer already exists");
	}


}
