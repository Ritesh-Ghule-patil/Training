package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class AccountTest {
//	private static Optional<Account> reduce;

	public static void main(String[] args) {

		ArrayList<Account> accounts = new ArrayList<>();
		accounts.add(new Account(101, "Ritesh", 10000));
		accounts.add(new Account(103, "Shivam", 5000));
		accounts.add(new Account(104, "Shubham", 12878));
		accounts.add(new Account(105, "Ashish", 34328));

		System.out.println("\na. Show Account details of account with minimum Balance");
		
		Optional<Account> minBalance =accounts.stream().min(Comparator.comparingDouble(obj->obj.getBalance()));
		System.out.println(minBalance);

		System.out.println("\nb.Show Account details of account with maximum Balance");
		Optional<Account> maxBalance = accounts.stream().max(Comparator.comparingDouble(a -> a.getBalance()));
		System.out.println(maxBalance);
		
		System.out.println("\nc. Show names greater than 6 characters");
		accounts.stream().filter(a-> a.getName().length()>6).forEach(System.out::println);
		
		System.out.println("\nd. find total of balance of all accounts");
		double sum = accounts.stream().mapToDouble(a->a.getBalance()).sum();
		System.out.println("Total is : "+sum);
		
		
	}

	
}
