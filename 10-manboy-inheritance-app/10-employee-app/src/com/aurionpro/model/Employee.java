package com.aurionpro.model;

public abstract class Employee {

	private int employeeNumber;
	private String name;
	private double basicSalary;

	Employee(int employeeNumber, String name, double basicSalary) {
		this.employeeNumber = employeeNumber;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getName() {
		return name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}
	
	public abstract double calculateAnnualCTC() ;
	
	
		

}
