package com.example.demo.Servicemongodp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modelwithmongodp.Address;

import com.example.demo.Repository.mongodp.AddressRepository;
@Service
public class AddressServiceMongi {
	
	
	@Autowired
	   private AddressRepository addressRepository;
		
		public  Address save(Address address)  {
			return addressRepository.save(address);
		}
		
		public Optional<Address> findbyid(int id) {
			return addressRepository.findById(id);
			
		}
		
		
		public List<Address> findAll() {
			return addressRepository.findAll();
		}

		public String deleteById(int id) {
			return "employee deleted Succesfully";
		
			
		}
}
