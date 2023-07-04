package com.example.jsapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student1")
public class Student1Controller {
     @Autowired
	private Student1Repository student1Repository;

	@PostMapping("save")
	public ResponseEntity<Student1> save(@RequestBody Student1 student1) {
		student1Repository.save(student1);
		return ResponseEntity.ok(student1);
	}
}
