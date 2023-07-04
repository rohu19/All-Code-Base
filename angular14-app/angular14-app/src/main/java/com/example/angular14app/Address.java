package com.example.angular14app;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {

	private String state;
	private String district;
	@Id
	private Integer pinNo;

	@OneToOne
	@JsonIgnore
	private Person person;

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDistrict() {
		return district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPinNo() {
		return pinNo;
	}

	public void setPinNo(Integer pinNo) {
		this.pinNo = pinNo;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
