package com.example.jsapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This annotation use for to set Spring Controller
@RequestMapping("cust") // this controller set for http server side
public class CustomerController {
	@Autowired // to set crude repository
	private CustomerRepository customerRepository;

	@GetMapping("read1/{age}")
	public Customer read1(@PathVariable Integer age) {
		return customerRepository.findByAge(age);
	}

	@GetMapping("read2/{firstName}")
	public Customer read2(@PathVariable String firstName) {
		return customerRepository.findByFirstName(firstName);
	}

	@GetMapping("read3/{lastName}")
	public Customer read3(@PathVariable String lastName) {
		return customerRepository.findByLastName(lastName);
	}

	@GetMapping("read4/{email}")
	public Customer read4(@PathVariable String email) {
		return customerRepository.findByEmail(email);
	}

	@GetMapping("read5/{firstName}")
	public Iterable<Customer> read5(@PathVariable String firstName) {
		return customerRepository.findAllByFirstName(firstName);
	}

	@GetMapping("read6/{firstName}/{lastName}")
	public Iterable<Customer> read6(@PathVariable String firstName, @PathVariable String lastName) {
		return customerRepository.findAllByFirstNameOrLastName(firstName, lastName);
	}

	@GetMapping("read7/{firstName}/{lastName}")
	public Iterable<Customer> read7(@PathVariable String firstName, @PathVariable String lastName) {
		return customerRepository.findAllByFirstNameAndLastName(firstName, lastName);
	}

	@GetMapping("read8/{firstName}")
	public Iterable<Customer> read8(@PathVariable String firstName) {
		return customerRepository.findAllByFirstNameLike("%" + firstName + "%");
	}

	@GetMapping("read9")
	public Iterable<Customer> read9() {
		return customerRepository.read1();
	}

	@GetMapping("read10")
	public Iterable<String> read10() {
		return customerRepository.read2();
	}

	@GetMapping("read11")
	public Iterable<Object[]> read11() {
		return customerRepository.read3();
	}

	@GetMapping("read12")
	public Iterable<Object[]> read12() {
		return customerRepository.read4();
	}

	@GetMapping("read13/{age}")
	public Iterable<Object[]> read13(@PathVariable Integer age) {
		return customerRepository.read6(age);
	}

	@GetMapping("read14/{age}")
	public Iterable<Object[]> read14(@PathVariable Integer age) {
		return customerRepository.read7(age);
	}

	@GetMapping("read15/{age}")
	public Iterable<Object[]> read15(@PathVariable Integer age) {
		return customerRepository.read5(age);
	}

	@GetMapping("read16")
	public Iterable<CustomerDTO> read16() {
		return customerRepository.read8();
	}

	@GetMapping("read17")
	public Iterable<CustomerDTO2> read17() {
		return customerRepository.read9();
	}
//jql only for class 
}
