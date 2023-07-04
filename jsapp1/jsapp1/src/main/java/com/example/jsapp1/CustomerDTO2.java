package com.example.jsapp1;

public class CustomerDTO2 {
	private String lastName;
	private Integer age;
	private String email;

	public CustomerDTO2(String lastName, Integer age, String email) {
		super();
		this.lastName = lastName;
		this.age = age;
		this.email = email;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

}
