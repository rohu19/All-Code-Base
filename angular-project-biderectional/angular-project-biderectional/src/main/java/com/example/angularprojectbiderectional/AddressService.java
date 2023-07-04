package com.example.angularprojectbiderectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepository;

	public Address save(Address address) {
//		address.getPerson().setAddress(address);
		return addressRepository.save(address);
	}

	public Iterable<Address> list() {
		return addressRepository.findAll();
	}

	public Address search(Long pinNo) {
		return addressRepository.findByPinNo(pinNo);
	}

}
