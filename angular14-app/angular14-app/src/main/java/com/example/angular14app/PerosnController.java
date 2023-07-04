package com.example.angular14app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
@CrossOrigin
public class PerosnController {

	@Autowired
	private PersonService personService;

	@PostMapping
	public ResponseEntity<Person> save(@RequestBody Person person) {
		return ResponseEntity.ok(personService.save(person));
	}

	@GetMapping
	public ResponseEntity<Iterable<Person>> list() {
		return ResponseEntity.ok(personService.list());
	}

	@PostMapping("data") // http://localhost:9090/person/data
	public ResponseEntity<Person> save1(@RequestBody Person person) {
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		return ResponseEntity.ok(personService.save(person));

	}

	@GetMapping("search/{firstName}")
	public ResponseEntity<Person> search(@PathVariable String firstName) {
		return ResponseEntity.ok(personService.search(firstName));
	}
}
