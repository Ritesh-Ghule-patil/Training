package com.aurionpro.model;

public class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee(int employeeNumber, String name, double basicSalary) {
		this.id = employeeNumber;
		this.name = name;
		this.salary = basicSalary;
	}

	public int getEmployeeNumber() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBasicSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
