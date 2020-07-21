package com.springautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springautowire/config.xml");
		City city=(City)context.getBean("city");
		System.out.println(city);

	}

}
