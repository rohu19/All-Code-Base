package com.example.jsapp1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer rollNum;
	private String sunName;
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
	public Integer getRollNum() {
		return rollNum;
	}
	public void setRollNum(Integer rollNum) {
		this.rollNum = rollNum;
	}
	public String getSunName() {
		return sunName;
	}
	public void setSunName(String sunName) {
		this.sunName = sunName;
	}
}

/*
 {
 "id":1,
 "firstName":"Rohan",
 "lastName":"Kumar",
 "rollNum":5386,
 "sunName":"Btech"
 }
*/
