package com.aurionpro.test;

import com.aurionpro.module.Account;
import com.aurionpro.module.CurrentAccount;
import com.aurionpro.module.SavingAccount;

public class AccountMain {

	public static void main(String[] args) {

		SavingAccount account =new SavingAccount(101, "ritesh", 10000);
		account.withdraw(1000);
		printDetail(account);
		System.out.println("------------------");
		
		CurrentAccount current = new CurrentAccount(102, "RITESH", 10000);
		printDetail(current);
		current.withdraw(60000);
		printDetail(current);
		
		
	}

	private static void printDetail(Account account) {
		System.out.println("Account Holder name :"+ account.getName());
		System.out.println("account balance is :"+ account.getBalance());
	}

	

}
