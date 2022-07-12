package com.player.test;

import java.util.ArrayList;

import com.player.model.Player;
import com.player.model.PlayerInfo;

public class Playertest {
	public static void main(String[] args) {

		ArrayList<Player> players = new ArrayList<>();

		players.add(new Player(101, "sachin", 100, 500, 80));
//		players.add(new Player(102, "Rohit", 76, 3044, 0));
//		players.add(new Player(103, "Dhoni", 201, 13000, 2));
//		players.add(new Player(104, "Bumrah", 101, 1000, 300));
//		players.add(new Player(105, "chahal", 80, 2002, 95));
//		players.add(new Player(106, "virat", 20, 1000, 0));
//		players.add(new Player(107, "shami", 45, 2034, 2));
//		players.add(new Player(108, "ishant", 20, 3000, 0));

		PlayerInfo info = new PlayerInfo(players);

		ArrayList<Player> aListers = info.getAListers();
		System.out.println("A Lister Players are: ");
		info.getPlayerDetails(aListers);
//		System.out.println(aListers);
		System.out.println("********NEXT CATEGORY PLAYERS************");

		ArrayList<Player> bListers = info.getBListers();
		System.out.println("B Lister Players are: ");
		info.getPlayerDetails(bListers);
//		System.out.println(bListers);
		System.out.println("********NEXT CATEGORY PLAYERS************");

		ArrayList<Player> cListers = info.getCListers();
		System.out.println("C Lister Players are: ");
		info.getPlayerDetails(cListers);

//		System.out.println(cListers);
//		System.out.println("-----------------------------------------");
//
//		Player maxScorer = info.getMaxScorerPlayer();
//		System.out.println("max Scorer Player is :");
//		info.getPlayerDetail(maxScorer);
//
//		Player minScorer = info.getMinScorerPlayer();
//		System.out.println("min Scorer Player is :");
//		info.getPlayerDetail(minScorer);
//
//		Player maxWicketer = info.getMaxWicketerPlayer();
//		System.out.println("max Wicketer Player is :");
//		info.getPlayerDetail(maxWicketer);
//
//		Player minWicketer = info.getMinWicketerPlayer();
//		System.out.println("min Wicketer Player is :");
//		info.getPlayerDetail(minWicketer);

	}
}
