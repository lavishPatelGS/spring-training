package org.groupsoft.training.spring_training.jdbc.crud.student;

import org.groupsoft.training.spring_training.jdbc.crud.student.dao.StudentDao;
import org.groupsoft.training.spring_training.jdbc.crud.student.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
//@ComponentScan(basePackages = {"org.groupsoft.training.spring_training.jdbc.crud.student.dao"})
public class JdbcConfig {

	@Bean(name = {"ds"})
	public DriverManagerDataSource getDataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost:5433/spring_training");
		ds.setUsername("postgres");
		ds.setPassword("root");

		return ds;
	}

	@Bean(name = {"jdbcTemplate"})
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean(name = {"studentDao"})
	public StudentDao getStudentDao() {
		StudentDaoImpl studentDao = new StudentDaoImpl();
		studentDao.setJdbcTemplate(getJdbcTemplate());
		return studentDao;
	}
}
