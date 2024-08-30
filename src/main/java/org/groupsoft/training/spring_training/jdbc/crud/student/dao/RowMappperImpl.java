package org.groupsoft.training.spring_training.jdbc.crud.student.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.groupsoft.training.spring_training.jdbc.crud.student.Student;
import org.springframework.jdbc.core.RowMapper;

public class RowMappperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setAddress(rs.getString(3));
		return student;
	}

}
