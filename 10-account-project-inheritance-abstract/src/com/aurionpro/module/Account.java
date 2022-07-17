package com.aurionpro.module;

public abstract class Account {

	private final int accountNumber;
	private final String name;
	private double balance;


	public Account(int id, String name, double balance) {
		this.accountNumber = id;
		this.name = name;
		this.balance = balance;
	}


	public int getId() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public abstract void withdraw(int amt);
	
	public boolean deposite(int amt) {

		if (amt > 0) {
			balance += amt;
			return true;

		}
		return false;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
