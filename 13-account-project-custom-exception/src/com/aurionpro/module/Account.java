package com.aurionpro.module;

import java.util.Scanner;

public class Account {

	private final int accountNumber;
	private final String name;
	private double balance;

	public Account(int id, String name, double balance) {
		this.accountNumber = id;
		this.name = name;
		this.balance = balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	private final int minimumBalance = 1000;

	Scanner sc = new Scanner(System.in);

	public int getId() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(int amt) throws InsufficientAmmountException {

		if(amt > balance) {
			throw new  InsufficientAmmountException("You Dont have the Sufficient Ammount In Your Account");
		}
	}

	public boolean deposite(int amt) {

		if (amt > 0) {
			balance += amt;
			return true;

		}
		return false;
	}

}
