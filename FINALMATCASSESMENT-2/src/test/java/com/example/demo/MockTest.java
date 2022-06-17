package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Person;
import com.example.demo.Service.EmployeeService;
import com.example.demo.repository.EmployeeRepositorymysql;

@EnableAutoConfiguration(exclude = EmbeddedMongoAutoConfiguration.class)
@SpringBootTest
class MockTest {
	
	
	@Mock
	EmployeeRepositorymysql employeere;
	@InjectMocks
	EmployeeService employeeser;
	
	
	
	@Test
       public void	   MockTest() {
		Employee employee =new Employee();
		Person person =new Person();
		employee.setEmail("Dhayalan.p@10decodres");
        employee.setEmpName("Dhaylan");
        employee.setId(1);
        employee.setPerson(person);
		  employeeser.save(employee);
		
	}
	
	

}
