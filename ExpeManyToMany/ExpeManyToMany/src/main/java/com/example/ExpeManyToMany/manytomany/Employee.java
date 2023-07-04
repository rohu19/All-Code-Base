     package com.example.ExpeManyToMany.manytomany;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Employee {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private Set<DepartMent> departMents = new HashSet<>();
}
