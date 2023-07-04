package com.example.jsapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
  @Autowired
  private StudentRepository studestRepositry;
  
  @PostMapping("save")
  public ResponseEntity<Student>save(@RequestBody Student student){
	  studestRepositry.save(student);
	  return ResponseEntity.ok(student);
  }
}
