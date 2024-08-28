package org.groupsoft.training.spring_training.core.bean.lifecycle.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBased 
{
    public static void main( String[] args )
    {
    	String BEAN_FILE_PATH = "org/groupsoft/training/spring_training/core/bean/lifecycle/xml/xmlbasedconfig.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(BEAN_FILE_PATH);
		context.registerShutdownHook();
		DBConnection connection1 = context.getBean("connection1", DBConnection.class);
        System.out.println(connection1);
    }
}