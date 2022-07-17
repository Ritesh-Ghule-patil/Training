package com.aurionpro.module;

public class CurrentAccount extends Account {
	
	private final int OVERDRAFT = 50000;

	public CurrentAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	@Override
	public void withdraw(int amt) {
		if(this.getBalance()-amt > -OVERDRAFT ) {
			this.setBalance(this.getBalance()-amt);
		}
		else {
			System.out.println("Insufficient balance");
		}
		
	}

	
	
}
