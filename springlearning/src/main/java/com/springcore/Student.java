package com.springcore;

public class Student {

	private String name;
	private int id;
	public Student() {
		super();
		
	}

	private String city;

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return "id " + id + " name " + name + " city " + city + " ";
	}

	public Student(String name, int id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}
}
