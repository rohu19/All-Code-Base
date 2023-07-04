package com.example.jsapp1;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {

	public Customer findByAge(Integer age);

	public Customer findByFirstName(String firstName);

	public Customer findByLastName(String lastName);

	public Customer findByEmail(String email);

	public Iterable<Customer> findAllByFirstName(String firstName);

	public Iterable<Customer> findAllByFirstNameOrLastName(String firstName, String lastName);

	public Iterable<Customer> findAllByFirstNameAndLastName(String firstName, String lastName);

	public Iterable<Customer> findAllByFirstNameLike(String firstName);

	@Query("select c from Customer c")
	public Iterable<Customer> read1();

	@Query("select c.firstName from Customer c")
	public Iterable<String> read2();

	@Query("select c.firstName, c.age  from Customer c")
	public Iterable<Object[]> read3();

	@Query("select c.firstName, c.lastName, c.age  from Customer c")
	public Iterable<Object[]> read4();

	@Query("select c.firstName, c.lastName, c.age from Customer c where c.age=:arg")
	public Iterable<Object[]> read5(Integer arg);

	@Query("select c.firstName, c.lastName, c.age  from Customer c where c.age=?1")
	public Iterable<Object[]> read6(Integer arg);

	@Query(nativeQuery = true, value = "select c.first_Name, c.last_Name  from Customer c where c.age=?1")
	public Iterable<Object[]> read7(Integer arg);

	@Query("select new com.example.jsapp1.CustomerDTO(c.firstName, c.lastName)from Customer c")
	public Iterable<CustomerDTO> read8();

	@Query("select new com.example.jsapp1.CustomerDTO2(c.lastName, c.age,c.email)from Customer c")
	public Iterable<CustomerDTO2> read9();

}
//java persistence Api
//jql java query language
//Entity class name->Customer  primary key->String
//Condition Always CamelCase
//FINDBY using for unique column and primary key column
//FindAllby multiple records // then attribute name first latter by upper case later
