package com.learn.springjpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringjpaApplicationTests {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
		Employee emp= employeeRepository.findOne(1l);
		System.out.println(emp.getAddress());
		Employee emp2 = new Employee();
		emp2.setAddress("Sun");
		emp2.setName("Rakhi");
		emp2.setTechnology(".Net");
		employeeRepository.save(emp2);
		
	}

}
