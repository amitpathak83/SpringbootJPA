package com.learn.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping("/findByname")
	public Employee greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return employeeRepository.findByName(name);
	}
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hello "+name;
	}
	
	@RequestMapping("/insert")
	public String insert(@RequestParam(value = "name", defaultValue = "World") String name,@RequestParam(value = "tech", defaultValue = "java") String tech,@RequestParam(value = "address", defaultValue = "india") String add) {
		Employee emp = new Employee();
		emp.setName(name);
		emp.setTechnology(tech);
		emp.setAddress(add);
		employeeRepository.save(emp);
		return "saved";
	}
}