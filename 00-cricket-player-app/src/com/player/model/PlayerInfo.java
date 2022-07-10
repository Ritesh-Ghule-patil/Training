package com.player.model;

import java.util.Arrays;

public class PlayerInfo {

	private Player players[];

	public PlayerInfo(Player[] players) {
		this.players = players;
	}

	public Player[] getAListers() {
		Player aListers[] = new Player[players.length];
		for (int i = 0; i < players.length; i++) {
			if (players[i].getMatches() >= 100 && (players[i].getRuns() >= 5000 || players[i].getWickets() >= 150)) {
				aListers[i] = players[i];
			}
		}
		return aListers;
	}
	
	public Player[] getBListers() {
		Player bListers[] = new Player[players.length];

		for (int i = 0; i < players.length; i++) {
			if ((players[i].getMatches() >= 50 && players[i].getMatches() < 100)
					&& (players[i].getRuns() >= 3000 && players[i].getRuns() < 5000
							|| players[i].getWickets() >= 75 && players[i].getWickets() < 100)) {
				bListers[i] = players[i];
			}
		}
		return bListers;
	}

	public Player[] getCListers() {
		Player cListers[] = new Player[players.length];

		for (int i = 0; i < players.length; i++) {
			if (players[i].getMatches()<50 && (players[i].getRuns() < 3000 || players[i].getWickets() < 75)) {
				cListers[i] = players[i];
			}
		}
		return cListers;
	}

	public void playerInfo(Player players[]) {
		for (Player p : players) {
			if (p != null) {
				playerDetail(p);
//				System.out.println("Player is : " + p.getId());
//				System.out.println("Player Name : " + p.getName());
//				System.out.println("Player played : " + p.getMatches() + " Matches");
//				System.out.println("Player Scores : " + p.getRuns() + " Runs");
//				System.out.println("Player taken : " + p.getWickets() + " Wickets");
//				System.out.println("----------------------------------------");
			}
		}
	}

	public Player getMaxScorerPlayer() {
		Player maxScorer = players[0];
		for(Player p: players) {
			if(p.getRuns()>maxScorer.getRuns()) {
				maxScorer = p;
			}
		}
		return maxScorer;
	}
	
	public Player getMinScorerPlayer() {
		Player minScorer = players[0];
		for(Player p: players) {
			if(p.getRuns()<minScorer.getRuns()) {
				minScorer = p;
			}
		}
		return minScorer;
	}
	
	public Player getMaxWicketerPlayer() {
		Player maxWicketer = players[0];
		for(Player p: players) {
			if(p.getWickets()>maxWicketer.getWickets()) {
				maxWicketer = p;
			}
		}
		return maxWicketer;
	}
	
	public Player getMinWicketerPlayer() {
		Player minWicketer = players[0];
		for(Player p: players) {
			if(p.getWickets()<minWicketer.getWickets()) {
				minWicketer = p;
			}
		}
		return minWicketer;
	}
	
	public static void playerDetail(Player player) {
		System.out.println("Player is : " + player.getId());
		System.out.println("Player Name : " + player.getName());
		System.out.println("Player played : " + player.getMatches() + " Matches");
		System.out.println("Player Scores : " + player.getRuns() + " Runs");
		System.out.println("Player taken : " + player.getWickets() + " Wickets");
		System.out.println("----------------------------------------");
	}

	@Override
	public String toString() {
		return "PlayerInfo [players=" + Arrays.toString(players) + "]";
	}
}
