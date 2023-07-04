package com.example.onetooneUniDirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
public class AddressController {

	@Autowired
	private AddressService addressService;

	@PostMapping
	public Address save(@RequestBody Address address) {
		return addressService.save(address);
	}

	@GetMapping
	public List<Address> readAll() {
		return addressService.readall();
	}

	@GetMapping("/{id}")
	public Address read(@PathVariable Integer id) {
		return addressService.read(id);
	}

}
