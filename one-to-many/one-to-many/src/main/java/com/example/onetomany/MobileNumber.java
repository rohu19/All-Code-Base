package com.example.onetomany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class MobileNumber {
	@Id
	private Integer id;
	private Long mobileNumber;
	private String serviceProvider;

	@ManyToOne
	@JsonIgnore
	private Person person;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}


/*

     {
    "id":501,
	"mobileNumber":8726646429,
	"serviceProvider":"Airtel",
    "person":{
    "id",105
    }

}


*/

