package com.example.demo.Controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Address;

import com.example.demo.Service.AddressService;

@RestController
public class AddressController {
	org.slf4j.Logger logger = LoggerFactory.getLogger(AddressController.class);
	
	@Autowired
	AddressService addressService;
	
	@PostMapping
	("/addaddress")
	public List<Address> save1(@RequestBody List<Address> address) {
		logger.error("post mapping");
		return addressService.save(address);
	}

}
