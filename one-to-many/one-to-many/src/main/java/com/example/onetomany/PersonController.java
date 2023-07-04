package com.example.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController {

	@Autowired
	private PersonService personService;

	@PostMapping
	public ResponseEntity<Person> save(@RequestBody Person person) {
		return ResponseEntity.ok(personService.save(person));
	}

	// Controller calling service
	// service calling repository
	@GetMapping
	public ResponseEntity<Iterable<Person>> list() {
		return ResponseEntity.ok(personService.list());
	}
}
