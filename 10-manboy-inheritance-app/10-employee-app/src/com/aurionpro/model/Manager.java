package com.aurionpro.model;

public class Manager extends Employee {
	
	private double hra;
	private double da;
	private double ta;
	public double getHra() {
		return hra;
	}

	public double getDa() {
		return da;
	}

	public double getTa() {
		return ta;
	}

	

	public Manager(int employeeNumber, String name, double basicSalary) {
		super(employeeNumber, name, basicSalary);
		this.hra = (this.getBasicSalary()/100)*30;
		this.da = (this.getBasicSalary()/100)*20;
		this.ta = (this.getBasicSalary()/100)*10;
	}
	
	

	@Override
	public double calculateAnnualCTC() {
		double annualSalary = (getBasicSalary()+ this.getDa()+this.getHra()+this.getTa())*12;
		return annualSalary;
	}
	
	@Override
	public void printSalarySlip() {
		super.printSalarySlip();
		System.out.println("Designation of Employee : Manager" );
		System.out.println("Employee H.R.A is : "+hra);
		System.out.println("Employee D.A is : "+da);
		System.out.println("Employee T.A is : "+ta);
		System.out.println("Employee Annual CTC is :"+ this.calculateAnnualCTC());
	}

}
