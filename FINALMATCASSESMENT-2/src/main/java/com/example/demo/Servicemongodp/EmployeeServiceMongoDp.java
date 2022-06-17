package com.example.demo.Servicemongodp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modelwithmongodp.Employee;
import com.example.demo.Repository.mongodp.EmployeeRepository;


@Service
public class EmployeeServiceMongoDp {
	
	@Autowired
   private EmployeeRepository employeeRepository;
	
	public  Employee save(Employee employee)  {
		return employeeRepository.save(employee);
	}
	
	public Employee findbyid(int id) {
		return employeeRepository.findById(id);
		
	}
	
	
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	public String deleteById(int id) {
		return "employee deleted Succesfully";
	
		
	}



	
	
		
	}
