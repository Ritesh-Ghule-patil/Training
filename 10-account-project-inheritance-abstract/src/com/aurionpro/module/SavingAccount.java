package com.aurionpro.module;

public class SavingAccount extends Account {

	private final int MIN_BALANCE = 1000;

	public SavingAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	@Override
	public void withdraw(int amt) {

		if (this.getBalance() - amt <= MIN_BALANCE) {
			System.out.println("Insufficient Balance!! ");
			
		}
		else{
			this.setBalance(this.getBalance()-amt);
		}

	}

	

	
}
