package com.uma.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uma.demo.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
