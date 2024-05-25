package com.uma.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonModel {
	
	  private Long id;
	
	  private String name;
	  
	  private String address1;
	  
	  private String address2;  
	  
	  private String city;

}
