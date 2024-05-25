package com.uma.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uma.demo.model.PersonModel;
import com.uma.demo.service.PersonService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class PersonController {
	
	private final PersonService personService;
	
	@PostMapping("/persons")
	public void addPerson(@RequestBody PersonModel personModel) {
		log.info("PersonController -> addPerson: {}", personModel);
		personService.savePersonData(personModel);
	}
	

}
