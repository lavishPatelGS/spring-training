package org.groupsoft.training.spring_training.jdbc.crud.student.dao;

import org.groupsoft.training.spring_training.jdbc.crud.student.Student;

public interface StudentDao {
	public int insert(Student student);
	public Student get(int id);
}
