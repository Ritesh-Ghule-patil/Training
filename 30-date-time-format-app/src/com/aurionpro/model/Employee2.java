package com.aurionpro.model;

import java.time.LocalDate;

public class Employee2 {

	private int id;
	private String name;
	private double salary;
	private LocalDate dateOfJoining;

	public Employee2(int id, String name, double salary, LocalDate dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary + ", dateOfJoining=" + dateOfJoining
				+ "]";
	}
	

}
