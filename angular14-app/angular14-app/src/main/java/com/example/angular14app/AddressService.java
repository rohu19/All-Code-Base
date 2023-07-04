package com.example.angular14app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepository;

	public Address save(Address address) {
		return addressRepository.save(address);
	}

	public Iterable<Address> list() {
		return addressRepository.findAll();
	}

	public Address search(Integer pinNo) {
		return addressRepository.finByPinNo(pinNo);
	}
}
