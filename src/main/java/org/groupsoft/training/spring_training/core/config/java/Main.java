package org.groupsoft.training.spring_training.core.config.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student student = context.getBean("student2", Student.class);
		System.out.println(student);
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp);
	}
}
