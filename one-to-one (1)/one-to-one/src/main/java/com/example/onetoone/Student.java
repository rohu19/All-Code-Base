package com.example.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;

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

}

/*
 {
 " id":1,
 "firstName":"Rohan",
" lastName":"Kumar",
 " age":22
 }
 
 
 { "id":8236,
 "houseNo":"714/DNP",
 "streetName":"Dhanapur Chandauli",
  "adharNo":645560829136,
 "student":
 { 
   "id":2
 } 
}
 
 
 */





