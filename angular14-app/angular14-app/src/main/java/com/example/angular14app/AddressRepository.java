package com.example.angular14app;

import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
	public Address finByPinNo(Integer pinNo);
}
