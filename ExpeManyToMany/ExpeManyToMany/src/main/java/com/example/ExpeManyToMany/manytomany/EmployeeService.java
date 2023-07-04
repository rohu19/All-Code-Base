package com.example.ExpeManyToMany.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee save(Employee employee) {
		for (DepartMent departMent : employee.getDepartMents()) {
			departMent.setEmployee(employee);
		}
		return employeeRepository.save(employee);
	}

	public Iterable<Employee> list() {
		return employeeRepository.findAll();
	}

}
