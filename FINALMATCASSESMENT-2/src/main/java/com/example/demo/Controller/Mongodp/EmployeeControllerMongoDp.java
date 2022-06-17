package com.example.demo.Controller.Mongodp;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Modelwithmongodp.Address;
import com.example.demo.Modelwithmongodp.Employee;
import com.example.demo.Modelwithmongodp.Person;
import com.example.demo.Repository.mongodp.EmployeeRepository;
import com.example.demo.Servicemongodp.AddressServiceMongi;
import com.example.demo.Servicemongodp.EmployeeServiceMongoDp;
import com.example.demo.Servicemongodp.PersonServicemongo;



@RestController
public class EmployeeControllerMongoDp {
	
	

	    org.slf4j.Logger logger = LoggerFactory.getLogger(EmployeeControllerMongoDp.class);

	    @Autowired
	    private EmployeeRepository employeeService;
	    
	    @Autowired
	    EmployeeServiceMongoDp employeeser;
	    @Autowired
	    AddressServiceMongi addressser;
	    @Autowired
	   PersonServicemongo personser;
	    @PostMapping
	("/Eadd")
	    public Employee save1(@RequestBody Employee e) {
	    	logger.error("post mapping");
			return employeeser.save(e);
			
	    }
	   
	    @GetMapping("/Efind/{id}")

	    public   Employee getCustomer(@PathVariable("id") int id) {
			logger.error("get Mapping ");
			return employeeser.findbyid(id);
					 
		    }
	    

	    @GetMapping("/Efindall")

	    public List<Employee> getAllEmployee() {

	        return employeeService.findAll();
	    }

	    @DeleteMapping("/Edeleteby/{id}")

	    public String deleteEmployee(@PathVariable int id) {

	    	 return employeeser.deleteById(id);

	        
	    }

    @PutMapping("/Eupdateing")

	    public String updateEmployee(@RequestBody Employee e) {

	    	employeeService.save(e);

	        return "Updated Employee id " + e.getId();
	    }
    @PostMapping
	("/Aadd")
	    public Address save2(@RequestBody Address address) {
	    	logger.debug("Adderess post mapping");
			return addressser.save(address);
			
	    }
	   
	    @GetMapping("/Afind/{id}")

	    public   Optional<Address> getCustomer2(@PathVariable("id") int id) {
			logger.error("get Mapping for Address");
			return addressser.findbyid(id);
					 
		    }
	    

	    @GetMapping("/Afindall")

	    public List<Address> getAllEmployee2() {

	        return addressser.findAll();
	    }

	    @DeleteMapping("/Adeleteby/{id}")

	    public String deleteEmployee2(@PathVariable int id) {

	    	employeeService.deleteById(id);

	        return "Delete emp  id " + id;
	    }
	    
    @PutMapping("/Aupdateing")

	    public Address updateEmployee2(@RequestBody Address address) {

    	return addressser.save(address);

	        
	    }
    @PostMapping
	("/add")
	    public Person save3(@RequestBody Person person) {
	    	logger.error(" Person post mapping");
			return personser.save(person);
			
	    }
	   
	    @GetMapping("/find/{id}")

	    public   Optional<Person> getCustomer3(@PathVariable("id") int id) {
			logger.error("get Mapping for person");
			return personser.findbyid(id);
					 
		    }
	    

	    @GetMapping("/findall")

	    public List<Person> getAllEmployee3() {

	        return personser.findAll();
	    }

	    @DeleteMapping("/deleteby/{id}")

	    public String deleteEmployee3(@PathVariable int id) {

	    	personser.deleteById(id);

	        return "Delete emp  id " + id;
	    }

    @PutMapping("/updateing")

	    public String updateEmployee3(@RequestBody Person e) {

    	personser.save(e);

	        return "Updated Employee id " + e.getMadtharId();
	    }
	}


