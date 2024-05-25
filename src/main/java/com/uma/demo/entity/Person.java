package com.uma.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "PERSON")
public class Person {

  @Id
//  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name = "id")
  private Long id;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "address1")
  private String address1;
  
  @Column(name = "address2")
  private String address2;  
  
  @Column(name = "city")
  private String city;



//  protected Person() {}
//
//  public Customer(String firstName, String lastName) {
//    this.firstName = firstName;
//    this.lastName = lastName;
//  }
//
//  @Override
//  public String toString() {
//    return String.format(
//        "Customer[id=%d, firstName='%s', lastName='%s']",
//        id, firstName, lastName);
//  }
//
//  public Long getId() {
//    return id;
//  }
//
//  public String getFirstName() {
//    return firstName;
//  }
//
//  public String getLastName() {
//    return lastName;
//  }
}
