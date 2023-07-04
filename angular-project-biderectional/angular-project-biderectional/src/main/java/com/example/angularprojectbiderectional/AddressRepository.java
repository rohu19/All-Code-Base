package com.example.angularprojectbiderectional;

import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
	
	public Address findByPinNo(Long pinNo);
}
