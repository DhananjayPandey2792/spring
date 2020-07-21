package com.springcore;

import java.util.List;

public class Employee {

	private List<String> employeeName;
	private int employeeId;
	private double salary;

	public void setEmployeeName(List<String> employeeName) {
		this.employeeName = employeeName;

	}

	public List<String> getEmployeeName() {
		return employeeName;
	}

	public Employee() {
		super();

	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
