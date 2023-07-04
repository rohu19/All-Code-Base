package com.example.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mobileNumber")
public class MobileNumberController {
	@Autowired
	private MobileNumberService mobileNumberService;

	@PostMapping
	public ResponseEntity<MobileNumber> save(@RequestBody MobileNumber mobileNumber) {
		return ResponseEntity.ok(mobileNumberService.save(mobileNumber));
	}

	@GetMapping
	public ResponseEntity<Iterable<MobileNumber>> list() {
		return ResponseEntity.ok(mobileNumberService.list());
	}
}
