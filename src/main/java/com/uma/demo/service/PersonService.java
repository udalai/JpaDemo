package com.uma.demo.service;

import org.springframework.stereotype.Service;

import com.uma.demo.entity.Person;
import com.uma.demo.model.PersonModel;
import com.uma.demo.repository.PersonRepository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonService {
	
	private final PersonRepository personRepository;
	
	public void savePersonData(PersonModel  personModel) {
		
		personRepository.save(convertModelToEntity(personModel));
	}

	private Person convertModelToEntity(PersonModel personModel) {
		Person person = new Person();
		person.setId(personModel.getId());
		person.setName(personModel.getName());
		person.setAddress1(personModel.getAddress1());
		person.setAddress2(personModel.getAddress2());
		person.setCity(personModel.getCity());


		return person;
	}
	

}
