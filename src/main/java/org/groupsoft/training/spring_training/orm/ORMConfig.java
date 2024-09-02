package org.groupsoft.training.spring_training.orm;

import java.util.Properties;

import org.groupsoft.training.spring_training.orm.dao.ProductDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
//@ComponentScan(basePackages = {"org.groupsoft.training.spring_training.jdbc.crud.student.dao"})
public class ORMConfig {

	@Bean(name = { "ds" })
	public DriverManagerDataSource getDataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost:5433/spring_training");
		ds.setUsername("postgres");
		ds.setPassword("root");

		return ds;
	}

	@Bean(name = { "factory" })
	public SessionFactory getLocalSessionFactoryBean() {
		FactoryBean<SessionFactory> sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL81Dialect");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		sessionFactory.setHibernateProperties(hibernateProperties);
		Class<?>[] annotatedClasses = new Class<?>[] { Product.class };
		sessionFactory.setAnnotatedClasses(annotatedClasses);

		return sessionFactory;
	}

	@Bean(name = { "ht" })
	public HibernateTemplate getHibernateTemplate() {
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
//		hibernateTemplate.setSessionFactory(getLocalSessionFactoryBean());
		return hibernateTemplate;
	}

	@Bean(name = { "productDao" })
	public ProductDao getProductDao() {
		ProductDao studentDao = new ProductDao();
		studentDao.setHt(getHibernateTemplate());
		return studentDao;
	}
}
