package com.auriopro.module;

public class Professor extends Person implements ISalary {

	private double basicSalary;

	public Professor(int id, String address, String dob, double salary) {
		super(id, address, dob);
		this.basicSalary = salary;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	@Override
	public double claculateSalary() {
		double allowances = basicSalary * 0.2;
		
		return basicSalary + allowances;
	}

	@Override
	public
	void getDetail() {
		super.getPersonDetail();
		System.out.println(" basic salary : "+ basicSalary);
		System.out.println(" salary : "+ claculateSalary());
		System.out.println("\n-------------------------------");
	}

}
