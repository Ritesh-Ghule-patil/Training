package com.aurionpro.model;

public class Account {

	private int id;
	private String name;
	private double balance;

	public Account(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.balance = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", salary=" + balance + "]";
	}

}
