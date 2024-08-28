package org.groupsoft.training.spring_training.core.autowire.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAutowire 
{
    public static void main( String[] args )
    {
    	String BEAN_FILE_PATH = "org/groupsoft/training/spring_training/core/autowire/xml/xmlautowireconfig.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(BEAN_FILE_PATH);
//		context.registerShutdownHook();
		DBConnection connection1 = context.getBean("connection1", DBConnection.class);
        System.out.println(connection1);
    }
}