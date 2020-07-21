package com.spring.jdbcdao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.entities.Student;

public class StudentDaoImpl implements StudentDao{
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query="insert into Student(id,sname) values(?,?)";
		int r=this.jdbcTemplate.update(query,student.getId(),student.getSname());
		return r;
	}
	public int change(Student student) {
		String query="update Student set Sname=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getSname(),student.getId());
		return r;
	}

	public int delete(int studentId) {
		String query="delete from Student where id=?";
		int r=this.jdbcTemplate.update(query, studentId);
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	

	
	

}
