package com.example.onetomany;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Person {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL) // THis is attributes of mobile number class
	private Set<MobileNumber> mobileNumber = new HashSet<>();

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

	public Set<MobileNumber> getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Set<MobileNumber> mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}

/*
 * 
 * { "id":105, "firstName":"Rohan", "lastName":"Kumar"
 * 
 * }
 
 
{
"id":101, 
"firstName":"Rohan",
 "lastName":"Kumar",
 "mobileNumber":[ {
    "id":501,
	"mobileNumber":8726646429,
	"serviceProvider":"Airtel",
    "person":{
    "id",101
    }
},
{
    "id":502,
	"mobileNumber":8953355346,
	"serviceProvider":"Idea",
    "person":{
    "id",101
    }
}
]
}
 
 
 
 
 */
