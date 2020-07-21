package com.springwithoutxml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
	Subject subject=	context.getBean("subject",Subject.class);
		System.out.println(subject);
		subject.study();

	}

}
