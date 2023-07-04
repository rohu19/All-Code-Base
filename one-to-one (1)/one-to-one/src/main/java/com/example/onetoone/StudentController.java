package com.example.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;

	@PostMapping
	public Student save(@RequestBody Student student) {
		return studentRepository.save(student);
	}
}