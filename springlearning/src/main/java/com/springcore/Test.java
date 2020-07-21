package com.springcore;

import java.net.Socket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/config.xml");
	Student student1=(Student) context.getBean("student1");
	System.out.println(student1);
	Student student2=(Student) context.getBean("student2");
	System.out.println(student2);
	Student student3=(Student) context.getBean("student3");
	System.out.println(student3);
	Employee employee=(Employee)context.getBean("employee");
	System.out.println(employee);
	Library lib=(Library)context.getBean("lib");
	System.out.println(lib);
	Person person=(Person)context.getBean("person");
	System.out.println(person);
	

	}

}
