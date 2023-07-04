package com.example.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;

	public Person save(Person person) {
		person.getAddress().setPerson(person);
		return personRepository.save(person);
	}

	public Iterable<Person> load() {
		return personRepository.findAll();
	}
}
