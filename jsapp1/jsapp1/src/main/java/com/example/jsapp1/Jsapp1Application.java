package com.example.jsapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jsapp1Application implements CommandLineRunner {
	

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(Jsapp1Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {// this is part of commandLineRunner Interface
		/*
		 * Person p1 = new Person(); p1.setFirstName("Rohan"); p1.setLastName("Kumar");
		 * 
		 * Person p2 = new Person(); p2.setFirstName("Akhilesh");
		 * p2.setLastName("Bhaiya");
		 * 
		 * Person p3 = new Person(); p3.setFirstName("Dimple");
		 * p3.setLastName("Bhabhi");
		 * 
		 * Person p4 = new Person(); p4.setFirstName("Kaliya");
		 * p4.setLastName("Mogambo");
		 * 
		 * Person p5 = new Person(); p5.setFirstName("Pk"); p5.setLastName("Chaacha");
		 * 
		 * personRepository.save(p1); personRepository.save(p2);
		 * personRepository.save(p3); personRepository.save(p4);
		 * personRepository.save(p5);
		 */

		Customer c1 = new Customer();
		c1.setCustomerId("c101");
		c1.setFirstName("Rohan");
		c1.setLastName("Kumar");
		c1.setAge(22);
		c1.setEmail("rk@gmail.com");
		customerRepository.save(c1);

		Customer c2 = new Customer();
		c2.setCustomerId("c102");
		c2.setFirstName("Suriya");
		c2.setLastName("Jhatiya");
		c2.setAge(21);
		c2.setEmail("sk@gmail.com");
		customerRepository.save(c2);

		Customer c3 = new Customer();
		c3.setCustomerId("c103");
		c3.setFirstName("Kishan");
		c3.setLastName("Jha");
		c3.setAge(23);
		c3.setEmail("kj@gmail.com");
		customerRepository.save(c3);

		Customer c4 = new Customer();
		c4.setCustomerId("c104");
		c4.setFirstName("Suriya");
		c4.setLastName("Jhatiya");
		c4.setAge(24);
		c4.setEmail("sJ@gmail.com");
		customerRepository.save(c4);

	}
}

//findBy single result only if multiple method then getting exception
