package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.Model.Person;


@EnableJpaRepositories
public interface PersonRepositorymysql extends JpaRepository <Person ,Long>{

}
