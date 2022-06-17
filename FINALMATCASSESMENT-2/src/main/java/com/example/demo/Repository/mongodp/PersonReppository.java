package com.example.demo.Repository.mongodp;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Modelwithmongodp.Person;



public interface PersonReppository extends MongoRepository<Person,Integer>{

}
