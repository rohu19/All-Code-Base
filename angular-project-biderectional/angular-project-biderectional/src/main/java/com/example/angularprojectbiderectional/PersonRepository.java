package com.example.angularprojectbiderectional;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
	
	public Person findByName(String name);

}
