package com.spring.jdbcdao;

import com.spring.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);

}
