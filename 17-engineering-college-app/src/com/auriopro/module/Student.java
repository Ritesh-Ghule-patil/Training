package com.auriopro.module;

public class Student extends Person {
	
	private BranchType branch;

	public Student(int id, String address, String dob, BranchType brach) {
		super(id, address, dob);
		this.branch = brach;
	}

	public BranchType getBranch() {
		return branch;
	}

	@Override
	public String toString() {
		return "Student [branch=" + branch + "]";
	}

	
	
	@Override
	public
	void getDetail() {
		super.getPersonDetail();
		System.out.println(" Branch : "+ getBranch());
		System.out.println("\n-------------------------------");
		
	}
	
	

}
