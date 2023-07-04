package com.example.ExpeManyToMany.manytomany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class DepartMent {
	@Id
	private Integer id;
	private String departMent;
	private Long salary;

	@JsonIgnore
	@ManyToOne
	private Employee employee;
}
