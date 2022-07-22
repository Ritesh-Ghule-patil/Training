package com.aurionpro.test;

import com.aurionpro.module.Account;
import com.aurionpro.module.InsufficientAmmountException;

public class AccountMain {

	public static void main(String[] args) {
		Account ac = new Account(101, "RITESH", 10000);
		
		try {
			ac.withdraw(20000);
		} catch (InsufficientAmmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("thank You For using our Services");
		}
		System.out.println("Great Job");
		
		
		
	}

	

}
