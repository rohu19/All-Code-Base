package com.example.jsapp1;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

//by default table name is entity name
@Entity
@Table(name = "p_person", uniqueConstraints = { @UniqueConstraint(columnNames = { "lastName" }),
		@UniqueConstraint(columnNames = { "firstName" }) })
// {@UniqueConstraint(columnNames = {"lastName"})})
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;/// primary key column in the table
	// @Column(name="f_name",nullable=false)
	private String firstName;
	// @Column(unique=true)//any column can be unique
	private String lastName;

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
}

/*
 * { "id":53, "firstName":"Rohan", "lastName":"Baghel", }
 */
