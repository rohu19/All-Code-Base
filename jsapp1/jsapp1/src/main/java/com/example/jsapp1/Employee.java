package com.example.jsapp1;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Employee {
	@EmbeddedId
	private EmployeePk employeePk;
	private String lastname;
	private Integer age;
	public EmployeePk getEmployeePk() {
		return employeePk;
	}
	public void setEmployeePk(EmployeePk employeePk) {
		this.employeePk = employeePk;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

}
