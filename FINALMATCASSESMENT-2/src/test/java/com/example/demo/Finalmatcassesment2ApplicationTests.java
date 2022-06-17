package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Person;
import com.example.demo.Service.EmployeeService;
import com.example.demo.repository.AddressRepositorymysql;
import com.example.demo.repository.EmployeeRepositorymysql;
import com.example.demo.repository.PersonRepositorymysql;
@EnableAutoConfiguration(exclude = EmbeddedMongoAutoConfiguration.class)
@SpringBootTest
class Finalmatcassesment2ApplicationTests {


	@Autowired
	EmployeeRepositorymysql employeeRep;
	@Autowired
	EmployeeService employeeservice;
	@Autowired
	PersonRepositorymysql personRep;
	@Autowired
	AddressRepositorymysql addressRep;
	


	@Test
	void testpersonPosetExample() {
		//person
		Person person =new Person();
		Employee employeee=new Employee();
		person.setAdtharId((long) 123456789);
		person.setAge(23);
		person.setMobileno(986574934);
		person.setName("Dhayalan121");
		person.setEmployee(employeee);
		personRep.save(person);
		
	} 
}
