package com.example.angular14app;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {

	public Person finByFirstName(String firstName);
}
