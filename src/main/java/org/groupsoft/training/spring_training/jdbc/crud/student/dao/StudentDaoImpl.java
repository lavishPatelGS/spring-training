package org.groupsoft.training.spring_training.jdbc.crud.student.dao;

import org.groupsoft.training.spring_training.jdbc.crud.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

//@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		String query = "insert into student(id, name, address) values(?,?,?)";
		int reult = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getAddress());
		return reult;
	}

	@Override
	public Student get(int id) {
		String query = "select * from student where id=?";
		Student result = this.jdbcTemplate.queryForObject(query, new RowMappperImpl(), id);
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

//	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
