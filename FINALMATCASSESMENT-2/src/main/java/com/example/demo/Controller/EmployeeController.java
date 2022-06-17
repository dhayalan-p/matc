package com.example.demo.Controller;



import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Confiq.JwtTokenUtil;
import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;
import com.example.demo.repository.EmployeeRepositorymysql;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
@RestController
@RequestMapping("/Dhayalan")
public class EmployeeController {
	org.slf4j.Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	PasswordEncoder encoder;
	@Autowired
	JwtTokenUtil jwtUtils;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private EmployeeRepositorymysql employeeRepository;
	
	
	@PostMapping
	("/addmysql")
	@PreAuthorize("hasRole('ADMIN')")
	public Employee save1(@RequestBody Employee e) {
		logger.trace("post mapping mysql");
		return employeeService.save(e);
	}


	@GetMapping("/findmysql/{id}")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public   Employee getCustomer(@PathVariable("id") int id) {
		logger.trace("get Mapping for single id");
		return employeeService.getEmployee(id);

	}
	@GetMapping("/findallmysql")
	@PreAuthorize("hasRole('ADMIN')")
	public Page<Employee> getAllEmployee(Pageable pageble) {
		logger.trace("get Mapping");

		return employeeRepository.findAll(pageble);
	}

	@DeleteMapping("/deletebymysql/{id}")
	@PreAuthorize("hasRole('MODERATOR','ROLE_ADMIN')")
	
	public String deleteEmployee(@PathVariable int id) {
		logger.trace("Delaete mapping mysql");
		employeeService.deleteById(id);

		return "Delete emp  id " + id;
	}

	@PutMapping("/updateingmysql")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String updateEmployee(@RequestBody Employee e) {
		logger.trace("Ubdate mapping mysql");
		employeeService.save(e);

		return "Updated Employee id " + e.getId();
	}
	

}
