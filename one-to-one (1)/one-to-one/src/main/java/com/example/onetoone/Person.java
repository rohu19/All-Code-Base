package com.example.onetoone;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
//to avoid 
	// @OneToOne(mappedBy="person",cascade = CascadeType.ALL)//this only changed
	// foregnkey
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Address address;

//for saving  address and person we require cascade 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}

/*
 * 
 * { "id":1, "firstName":"rohan", "lastName":"kumar", "age":22, "address":{
 * "id":101, "houseNo":"123/M", "streetName":"btm", "person": { "id":1 } }
 * 
 * 
 * 
 * 
 * { "id":101, "houseNo":"123/M", "streetName":"btm", "person": { "id":1 } }
 * 
 * 
 * 
 * 
 * 
 */