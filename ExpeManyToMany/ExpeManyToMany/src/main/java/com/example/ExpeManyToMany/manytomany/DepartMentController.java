package com.example.ExpeManyToMany.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("department")
public class DepartMentController {

	@Autowired
	private DepartMentService departMentService;

	@PostMapping
	public ResponseEntity<DepartMent> save(@RequestBody DepartMent departMent) {
		return ResponseEntity.ok(departMentService.save(departMent));
	}

	@GetMapping
	public ResponseEntity<Iterable<DepartMent>> list() {
		return ResponseEntity.ok(departMentService.list());
	}
}
