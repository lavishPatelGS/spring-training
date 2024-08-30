package org.groupsoft.training.spring_training.jdbc.crud.student;

import org.groupsoft.training.spring_training.jdbc.crud.student.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String BEAN_FILE_PATH = "org/groupsoft/training/spring_training/jdbc/crud/student/config.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(BEAN_FILE_PATH);
//		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//		Student student = new Student();
//		student.setId(2);
//		student.setName("Demo");
//		student.setAddress("Delhi");
//		System.out.println(studentDao.insert(student));
		System.out.println(studentDao.get(2));
		
		

	}
}
