package com.example.jsapp1;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public class EmployeePk implements Serializable {
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
		return (obj instanceof EmployeePk) && firstName.equals(((EmployeePk) obj).firstName)
				&& email.equals(((EmployeePk) obj).email);
	}
}
