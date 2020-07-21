package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.entities.Student;
import com.spring.jdbcdao.StudentDao;

public class main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springjdbc/config.xml");
		JdbcTemplate template= context.getBean("jdbcTemplate",JdbcTemplate.class);
		
		//String query="insert into Student(id,sname) values(?,?)";
	//	int result=template.update(query,1,"sonu");
		//System.out.println(result);
		StudentDao student=context.getBean("studentDao",StudentDao.class);
		Student st=new Student();
		//st.setId(2);
		//st.setSname("test");
		
		int r=student.delete(2);
		System.out.println(r);
	}

}
