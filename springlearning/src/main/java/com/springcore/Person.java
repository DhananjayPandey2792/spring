package com.springcore;

public class Person {
	private String personName;
	private int age;
	public Person() {
		super();
	}
	public Person(String personName,int age) {
		this.personName=personName;
		this.age=age;
	}
	public String toString() {
		return "personName "+personName+" age "+age+" ";
	}

}
