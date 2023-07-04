package com.example.classtest;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {
	public Person findByEmail(String email);

}
