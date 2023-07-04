package com.example.jsapp1;

public class CustomerDTO {
	private String firstName;
	private String lastName;

	public CustomerDTO(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
