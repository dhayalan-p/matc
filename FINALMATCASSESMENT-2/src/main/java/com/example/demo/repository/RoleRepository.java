package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.ERole;
import com.example.demo.Model.Role;


public interface RoleRepository extends JpaRepository<Role, String>{
	
	Optional<Role> findByName(ERole name);

}
