package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.EmployeeNotFoundexception;
import com.example.demo.Model.Address;

import com.example.demo.repository.AddressRepositorymysql;

@Service
public class AddressService {
	
@Autowired
	
	private AddressRepositorymysql addressRepository;
	

public  List<Address> save(List<Address> address){
	
	addressRepository.save(address);
	return address;
}
public Address getAddress(int id) {

	return addressRepository.findById(id).orElseThrow(
			()
			-> new EmployeeNotFoundexception(
					"NO CUSTOMER PRESENT WITH ID = " + id));

}

}
