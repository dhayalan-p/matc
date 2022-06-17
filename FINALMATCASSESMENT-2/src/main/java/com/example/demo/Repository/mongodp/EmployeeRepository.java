package com.example.demo.Repository.mongodp;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Modelwithmongodp.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

	
Employee save(Employee e);

Employee findById(int id);





	

}
