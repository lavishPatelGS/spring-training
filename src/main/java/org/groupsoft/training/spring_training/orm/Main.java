package org.groupsoft.training.spring_training.orm;

import org.groupsoft.training.spring_training.orm.dao.ProductDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		String BEAN_FILE_PATH = "org/groupsoft/training/spring_training/orm/config.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext(BEAN_FILE_PATH);
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		ProductDao productDao = context.getBean(ProductDao.class);

		Product p1 = new Product(2, "spring", true);
		System.out.println(productDao.insert(p1));
	}
}
 