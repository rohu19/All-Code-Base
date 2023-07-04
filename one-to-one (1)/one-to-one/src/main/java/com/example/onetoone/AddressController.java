package com.example.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
public class AddressController {
	@Autowired
	private AddressRepository addressRepository;

	@PostMapping
	public Address save(@RequestBody Address address) {
		return addressRepository.save(address);
	}

	@GetMapping
	public Iterable<Address> load() {
		return addressRepository.findAll();
	}

}
