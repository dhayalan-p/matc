package com.example.demo.Repository.mongodp;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Modelwithmongodp.Address;


public interface AddressRepository extends MongoRepository<Address,Integer>{

}
