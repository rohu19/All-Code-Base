package com.example.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("skill")
public class SkillController {
	@Autowired
	private SkillServices skillServices;

	@PostMapping
	public ResponseEntity<Skill> save(@RequestBody Skill skill) {
		return ResponseEntity.ok(skillServices.save(skill));
	}

	@GetMapping
	public ResponseEntity<Iterable<Skill>> list() {
		return ResponseEntity.ok(skillServices.list());
	}
}
