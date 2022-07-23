package com.auriopro.module;

public abstract class Person {

	private int id;
	private String address;
	private String dob;

	Person(int id, String address, String dob) {
		this.id = id;
		this.address = address;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getDob() {
		return dob;
	}
	
	public void getPersonDetail(){
		System.out.println(" Id : "+ getId());
		System.out.println(" Address : "+ getAddress());
		System.out.println(" DOB : "+ getDob());
	}
	
	abstract void getDetail();

	@Override
	public String toString() {
		return "Person [id=" + id + ", address=" + address + ", dob=" + dob + "]";
	}

}
