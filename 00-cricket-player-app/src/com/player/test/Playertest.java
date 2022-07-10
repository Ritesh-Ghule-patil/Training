package com.player.test;

import java.util.Scanner;

import com.player.model.Player;
import com.player.model.PlayerInfo;

public class Playertest {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.print("How any player you want to enter : ");
//		int number = sc.nextInt();
//		Player players[] = new Player[number];

//		for (int player = 0; player < number; player++) {
//
//			System.out.print("Enter player id : ");
//			int id = sc.nextInt();
//			System.out.println("Enetr Player Name : ");
//			String name = sc.next();
//			System.out.println("Enetr Player Matches : ");
//			int matches = sc.nextInt();
//			System.out.println("Enetr Player Runs : ");
//			int runs = sc.nextInt();
//			System.out.println("Enetr Player Wickets : ");
//			int wickets = sc.nextInt();
//			
//			players[player] = new Player(id, name , matches, runs, wickets);
//			System.out.println("\n-------------------------------\n");
//		}

		Player players[] = {
				new Player(101, "sachin", 101, 5050,0),
				new Player(102, "Rohit", 76, 3044,0),
				new Player(103, "Dhoni", 201, 13000,2),
				new Player(104, "Bumrah", 101, 1000,300),
				new Player(105, "chahal", 80, 2002,95),
				new Player(106, "virat", 20, 1000,0),
				new Player(107, "shami", 45, 2034,2),
				new Player(108, "ishant", 20, 3000,0)	 
			};
					
		PlayerInfo info = new PlayerInfo(players);
		
		
		Player aListers[] = info.getAListers();
		System.out.println("A Lister Players are: ");
		info.playerInfo(aListers);
		System.out.println();
		
		Player bListers[] = info.getBListers();
		System.out.println("B Lister Players are: ");
		info.playerInfo(bListers);
		System.out.println();

		Player cListers[] = info.getCListers();
		System.out.println("C Lister Players are: ");
		info.playerInfo(cListers);
		System.out.println();
		
		Player maxScorer = info.getMaxScorerPlayer();
		System.out.println("max Scorer Player is :");
		PlayerInfo.playerDetail(maxScorer);
		
		Player minScorer = info.getMinScorerPlayer();
		System.out.println("min Scorer Player is :");
		PlayerInfo.playerDetail(minScorer);

		Player maxWicketer = info.getMaxWicketerPlayer();
		System.out.println("max Wicketer Player is :");
		PlayerInfo.playerDetail(maxWicketer);
		
		Player minWicketer = info.getMinWicketerPlayer();
		System.out.println("min Wicketer Player is :");
		PlayerInfo.playerDetail(minWicketer);
	}
}
