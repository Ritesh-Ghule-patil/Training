package com.aurionpro.model;

public class Accountant extends Employee {
	
	private double pearks;

	public double getPearks() {
		return pearks;
	}

	public Accountant(int employeeNumber, String name, double basicSalary) {
		super(employeeNumber, name, basicSalary);
		
		this.pearks = (this.getBasicSalary()/100)*50;
	}

	@Override
	public double calculateAnnualCTC() {
		double annualSalary =( getBasicSalary()+ this.getPearks())*12;
		return annualSalary;
	}
	
	@Override
	public void printSalarySlip() {
		super.printSalarySlip();
		System.out.println("Designation of Employee : Accountant" );
		System.out.println("Employee Perks is : "+pearks);
		System.out.println("Employee Annual CTC is :"+ this.calculateAnnualCTC());
	}

}
