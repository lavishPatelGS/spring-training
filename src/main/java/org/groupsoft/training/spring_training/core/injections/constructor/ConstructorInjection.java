package org.groupsoft.training.spring_training.core.injections.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String BEAN_FILE_PATH = "org/groupsoft/training/spring_training/core/injections/constructor/ciconfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(BEAN_FILE_PATH);
		A a = context.getBean("a", A.class);
		System.out.println(a);
	}

}
