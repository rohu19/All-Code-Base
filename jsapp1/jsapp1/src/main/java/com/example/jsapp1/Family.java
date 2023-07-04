package com.example.jsapp1;

public class Family {
	private Iterable<Person> persons;

	public void setPersons(Iterable<Person> persons) {
		this.persons = persons;
	}

	public Iterable<Person> getPersons() {
		return persons;
	}

	// this type of class plane and pojo class
}

/*
 * { "persons":[ { "firstName":"Rohan", "lastName":"Kumar" }, {
 * "firstName":"Shreya", "lastName":"Singh" }, { "firstName":"Prathana",
 * "lastName":"Kumari" } ] }
 * 
 */
