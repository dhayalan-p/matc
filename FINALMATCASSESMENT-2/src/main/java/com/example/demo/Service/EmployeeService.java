package com.example.demo.Service;







import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.example.demo.Exception.EmployeeNotFoundexception;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Person;
import com.example.demo.repository.EmployeeRepositorymysql;
@Service
public class EmployeeService {


	@Autowired

	private EmployeeRepositorymysql employeeRepository;


	public   Employee save(Employee employee){
		Person person= employee.getPerson();
		
	    
		person.setEmployee(employee);
		employee=employeeRepository.save(employee);
		System.out.println(employee);
		return employee ;
	}
	public Employee getEmployee(int id) {

		return employeeRepository.findById(id).orElseThrow(
				()
				-> new EmployeeNotFoundexception(
						"NO CUSTOMER PRESENT WITH ID = " + id));

	}
//
//	public 	Employee findAll(Pageable pageble) {
//
//		Employee employee=new Employee();
//		Page<Employee>employees=employeeRepository.findAll(pageble);
//		employee.setData(employees);
//		return employee;
//	}

	public  Employee deleteById(int id) {
		 employeeRepository.deleteById(id);
		return null;


	}






}
