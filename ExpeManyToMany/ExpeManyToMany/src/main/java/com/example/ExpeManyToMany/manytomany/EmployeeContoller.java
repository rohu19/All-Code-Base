package com.example.ExpeManyToMany.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class EmployeeContoller {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public ResponseEntity<Employee> save(@RequestBody Employee employee) {
		return ResponseEntity.ok(employeeService.save(employee));

	}

	@GetMapping
	public ResponseEntity<Iterable<Employee>> list() {
		return ResponseEntity.ok(employeeService.list());
	}

}
