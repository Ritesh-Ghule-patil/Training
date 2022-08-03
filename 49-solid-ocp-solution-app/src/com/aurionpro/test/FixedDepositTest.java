package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.Christmas;
import com.aurionpro.model.Diwali;
import com.aurionpro.model.Eid;
import com.aurionpro.model.FixedDeposit;
import com.aurionpro.model.Holi;

public class FixedDepositTest {
	public static void main(String[] args) {

		
		ArrayList<FixedDeposit> users = new ArrayList<>();
		users.add(new FixedDeposit("Ritesh", 100000, 1, new Diwali()));
		users.add(new FixedDeposit("Rizwan", 200000, 1, new Eid()));
		users.add(new FixedDeposit("Ashish", 100000, 2, new Holi()));
		users.add(new FixedDeposit("john", 100000, 1, new Christmas()));
		
		for (FixedDeposit user : users) {
			System.out.println("User Name : "+user.getName());
			System.out.println("Principle was: "+ user.getPrinciple());
			System.out.println("Intereste received :" +user.calculateSimleInterest());
			System.out.println("TotalAmmount :"+ user.getTotal());
			System.out.println("___________________________________\n");
		}
	}
}	
