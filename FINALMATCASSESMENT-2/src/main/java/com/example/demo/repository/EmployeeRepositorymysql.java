package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.Model.Employee;
import com.example.demo.Model.EmployeeDto;


public interface EmployeeRepositorymysql extends PagingAndSortingRepository <Employee ,Integer>{

	Optional<Employee> findByEmpName(String empName);

	boolean existsByEmail(String email);

	boolean existsByEmpName(String empName);

	void save(EmployeeDto e);


}
