package com.example.onetooneUniDirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	private PersonRepository personRepository;

	public Person save(Person perosn) {
		return personRepository.save(perosn);
	}

	public List<Person> readAll() {
		return (List<Person>) personRepository.findAll();
	}

	public Person read(Integer id) {
		return personRepository.findById(id).get();
	}
}
