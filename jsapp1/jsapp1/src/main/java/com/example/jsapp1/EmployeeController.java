package com.example.jsapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
  @PostMapping("save")
	public ResponseEntity<Employee> save(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return ResponseEntity.ok(employee);

	}

}

/*
{
"employeePk":{
"firstName":"abc",
"email":"a@gm.com"
},
"lastName":"test",
"age":22
}
  
 */
