package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Address;


public interface AddressRepositorymysql extends JpaRepository <Address ,Integer>{

	void save(List<Address> address);

 
}
