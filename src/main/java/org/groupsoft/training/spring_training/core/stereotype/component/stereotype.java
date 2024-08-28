package org.groupsoft.training.spring_training.core.stereotype.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */ 
public class stereotype 
{
    public static void main( String[] args )
    {
    	String BEAN_FILE_PATH = "org/groupsoft/training/spring_training/core/stereotype/component/componentannotationconfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(BEAN_FILE_PATH);
        Student student1 = (Student) context.getBean("student", Student.class);
        System.out.println(student1);
        
    }
}
