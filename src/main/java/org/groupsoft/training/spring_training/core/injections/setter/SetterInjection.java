package org.groupsoft.training.spring_training.core.injections.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */ 
public class SetterInjection 
{
    public static void main( String[] args )
    {
    	String BEAN_FILE_PATH = "org/groupsoft/training/spring_training/core/injections/setter/setterconfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(BEAN_FILE_PATH);
        Student student1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2", Student.class);
        System.out.println(student1);
        System.out.println(student2);
    }
}
