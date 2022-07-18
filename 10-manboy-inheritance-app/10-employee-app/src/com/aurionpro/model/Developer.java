package com.aurionpro.model;

public class Developer extends Employee {
	
	private double pa;
	public double getPa() {
		return pa;
	}

	public double getOt() {
		return ot;
	}

	private double ot;

	public Developer(int employeeNumber, String name, double basicSalary) {
		super(employeeNumber, name, basicSalary);
		
		this.pa = (this.getBasicSalary()/100)*30;
		this.ot= (this.getBasicSalary()/100)*20;
	}

	@Override
	public double calculateAnnualCTC() {
		double annualSalary =( getBasicSalary()+ this.getOt()+this.getPa())*12;
		return annualSalary;
	}
	@Override
	public void printSalarySlip() {
		super.printSalarySlip();
		System.out.println("Designation of Employee : Developer" );
		System.out.println("Employee O.T is : "+ot);
		System.out.println("Employee P.A is : "+pa);
	}

}
