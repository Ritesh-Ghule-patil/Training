package com.aurionpro.mode;

import java.util.Scanner;

public class PlayerTest {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
//		Player players[] = new Player[2];
//		for(int i=0; i<2; i++) {
//			System.out.print("Enter Player"+ (i+1)+" ID : ");
//			int id = sc.nextInt();
//			System.out.print("Enter Player"+ (i+1)+" Name : ");
//			String name = sc.next();
//			System.out.print("Enter Player"+ (i+1)+" age : ");
//			int age = sc.nextInt();
//			
//			players[i] = new Player(id, name, age);
//			System.out.println("----------------------------");
//			
//		}

		Player p1 = new Player("Sachin", 66);

		Player p2 = new Player("dhoni", 60);
		
		Player p3 = new Player("rohit", 50);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		

		
//		if (p1.IsElder(p2)) {
//			displayplayerDetail(p1);
//		}
//		else {
//			displayplayerDetail(p2);
//		}
		
		Player elder = Player.whoIsElder(p1, p2);
		displayplayerDetail(elder);
	}

	private static void displayplayerDetail(Player player) {
//		System.out.println("-----------------------");
		System.out.println( player.getName() +" is Elder ");
		//System.out.println(player.toString());
		System.out.println("--------------------------");
		System.out.println("Palyer ID is : " + player.getId());
		System.out.println("Player Name is : "+ player.getName());
		System.out.println("Player age is : "+ player.getAge());
		System.out.println("***************************");
		
	}

	
}
