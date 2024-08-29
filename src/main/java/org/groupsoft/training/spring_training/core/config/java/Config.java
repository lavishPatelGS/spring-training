package org.groupsoft.training.spring_training.core.config.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean({"student","student1","student2"})
	public Student student1() {
		Student student = new Student();

		student.setStudentId("1");
		student.setStudentName("Lavish");
		student.setStudentAddress("Indore");

		return student;
	}
	
	@Bean
	public Employee employee() {
		Employee employee = new Employee("1","Lavish");
		return employee;
	}

}
