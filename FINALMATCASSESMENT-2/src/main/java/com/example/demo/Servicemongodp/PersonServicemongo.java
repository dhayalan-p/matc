package com.example.demo.Servicemongodp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modelwithmongodp.Employee;
import com.example.demo.Modelwithmongodp.Person;
import com.example.demo.Repository.mongodp.EmployeeRepository;
import com.example.demo.Repository.mongodp.PersonReppository;
@Service
public class PersonServicemongo {
	
	@Autowired
	   private PersonReppository personRepository;
		
		public  Person save(Person person)  {
			return personRepository.save(person);
		}
		
		public Optional<Person> findbyid(int id) {
			return personRepository.findById(id);
			
		}
		
		
		public List<Person> findAll() {
			return personRepository.findAll();
		}

		public String deleteById(int matharid) {
			return "employee deleted Succesfully";
		
			
		}



}
