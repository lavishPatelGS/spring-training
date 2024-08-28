package org.groupsoft.training.spring_training.core.injections.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String BEAN_FILE_PATH = "org/groupsoft/training/spring_training/core/injections/property/propertyconfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(BEAN_FILE_PATH);
		Employee emp1 = context.getBean("emp1", Employee.class);
		System.out.println(emp1);
		System.out.println(emp1.getPhone().getClass().getName());
	}

}
