package com.example.jsapp1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity // table purpose
@IdClass(StudentPk.class) // PrimaryKey
public class Student1 {

	/*
	     {
	     "firstName":"Rohan",
	     "email":"rk@gmail.com",
	     "lastName":"Kumar",
	     "age": 22
	     }
	     
	 */
	@Id
	private String firstName;
	@Id
	private String email;
	private String lastName;
	private Integer age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	//Separate bin type class required bin type is iterable type entity
	//for every entity class one repository interface required

}
