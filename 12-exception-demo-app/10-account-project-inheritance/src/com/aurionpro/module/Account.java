package com.aurionpro.module;

import java.util.Scanner;

public class Account {

	private final int accountNumber;
	private final String name;
	private double balance;
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	private final int minimumBalance = 1000;

	Scanner sc = new Scanner(System.in);

	public Account(int id, String name, double balance) {
		this.accountNumber = id;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
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

	public void withdraw(int amt) {

		if (balance - amt >= minimumBalance) {
			balance -= amt;
			
		}
		System.out.println("insufficient balance");

	}

	public boolean deposite(int amt) {

		if (amt > 0) {
			balance += amt;
			return true;

		}
		return false;
	}

}
