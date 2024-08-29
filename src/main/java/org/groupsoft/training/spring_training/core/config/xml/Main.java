package org.groupsoft.training.spring_training.core.config.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String BEAN_FILE_PATH = "org/groupsoft/training/spring_training/core/config/xml/config.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(BEAN_FILE_PATH);
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		context.close();
	}
}
