package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.FestivalType;
import com.aurionpro.model.FixedDeposit;

public class FixedDepositTest {
	public static void main(String[] args) {
		
//		FixedDeposit fd = new FixedDeposit("Ritesh", 100000, 1, FestivalType.DIWALI);
//		System.out.println(fd.calculateSimleInterest());
//		FixedDeposit fd2 = new FixedDeposit("harshal", 100000, 2, FestivalType.NEWYEAR);
//		System.out.println(fd2.calculateSimleInterest());
		
		ArrayList<FixedDeposit> users = new ArrayList<>();
		users.add(new FixedDeposit("Ritesh", 100000, 1, FestivalType.DIWALI));
		users.add(new FixedDeposit("harshal", 100000, 1, FestivalType.CHRISTMAS));
		users.add(new FixedDeposit("Ashish", 100000, 1, FestivalType.EID));
		users.add(new FixedDeposit("Shiuvam", 100000, 1, FestivalType.DIWALI));
		
		for (FixedDeposit user : users) {
			System.out.println(user.getName());
			System.out.println(user.calculateSimleInterest());
			System.out.println();
		}
	}
}	
