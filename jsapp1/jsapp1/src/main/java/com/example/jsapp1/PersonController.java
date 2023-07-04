package com.example.jsapp1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController {
	@Autowired
	private PersonRepository personRepository;

	@PostMapping("save")
	public ResponseEntity<Person> save(@RequestBody Person person) {
		personRepository.save(person);
		return ResponseEntity.ok(person);
	}

	@PostMapping("saveAll")
	public ResponseEntity<Iterable<Person>> saveAll(@RequestBody Family family) {
		personRepository.saveAll(family.getPersons());
		return ResponseEntity.ok(family.getPersons());
	}

	@DeleteMapping("del/{id}")
	public ResponseEntity<Integer> delete(@PathVariable Integer id) {
		personRepository.deleteById(id);
		return ResponseEntity.ok(id);
	}

	@DeleteMapping("del1")
	public ResponseEntity<Person> delete(@RequestBody Person person) {
		personRepository.delete(person);
		return ResponseEntity.ok(person);
	}

	@DeleteMapping("del2/{ids}")
	public ResponseEntity<String> delete(@PathVariable Integer[] ids) {
		List<Integer> allids = Arrays.asList(ids);
		personRepository.deleteAllById(allids);
		return ResponseEntity.ok(allids + "got delete");
	}

	@DeleteMapping("del3")
	public ResponseEntity<String> delete(@RequestBody Family family) {
		personRepository.deleteAll(family.getPersons());
		return ResponseEntity.ok("Delete Successfully");
	}

	@DeleteMapping("del4")
	public ResponseEntity<String> delete() {
		personRepository.deleteAll();
		return ResponseEntity.ok("Delete Successfully");
	}

	@GetMapping("read1/{id}")
	public ResponseEntity<Person> read(@PathVariable Integer id) {
		Person p1 = personRepository.findById(id).get();
		return ResponseEntity.ok(p1);
	}

	@GetMapping("read2")
	public ResponseEntity<Iterable<Person>> read2() {
		Iterable<Person> person = personRepository.findAll();
		return ResponseEntity.ok(person);
	}

	@GetMapping("read3/{ids}")
	public ResponseEntity<Iterable<Person>> read3(@PathVariable Integer[] ids) {
		List<Integer> allids = Arrays.asList(ids);
		Iterable<Person> person = personRepository.findAllById(allids);
		return ResponseEntity.ok(person);
	}

	@GetMapping("lala")
	public ResponseEntity<Long> lala() {
		long person = personRepository.count();
		return ResponseEntity.ok(person);
	}

	@GetMapping("lala1/{ids}")
	public ResponseEntity<Boolean> lala1(@PathVariable Integer ids) {

		boolean person = personRepository.existsById(ids);
		return ResponseEntity.ok(person);
	}

	

}
