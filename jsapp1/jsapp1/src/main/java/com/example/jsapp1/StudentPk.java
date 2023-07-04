package com.example.jsapp1;

import java.io.Serializable;

public class StudentPk implements Serializable {
	private String firstName;
	private String email;

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

	@Override
	public int hashCode() {

		return firstName.hashCode() + email.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof StudentPk) && firstName.equals(((StudentPk) obj).firstName)
				&& email.equals(((StudentPk) obj).email);
	}
}

//Archive Composite Primary key
//1->serializable
//2-> Overriding hashcode and equals



