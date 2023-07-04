package com.example.angularprojectbiderectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
@CrossOrigin
public class AddressController {

	@Autowired
	private AddressService addressService;

	@PostMapping
	public ResponseEntity<Address> save(@RequestBody Address address) {
		return ResponseEntity.ok(addressService.save(address));
	}
	

	@GetMapping
	public ResponseEntity<Iterable<Address>> list() {
		return ResponseEntity.ok(addressService.list());
	}

	@GetMapping("search/{pinNo}")
	public ResponseEntity<Address> search(@PathVariable Long pinNo) {
		return ResponseEntity.ok(addressService.search(pinNo));
	}
}
