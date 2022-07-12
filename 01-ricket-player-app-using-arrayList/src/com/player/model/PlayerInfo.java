package com.player.model;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayerInfo {

	ArrayList<Player> players = new ArrayList<>();

	public PlayerInfo(ArrayList<Player> player) {
		this.players = player;
	}

	ArrayList<Player> aLister = new ArrayList<Player>();

	public ArrayList<Player> getAListers() {

		for (Player player : players) {
			if (player.getMatches() >= 100 && (player.getRuns() >= 5000 || player.getWickets() >= 150)) {
				aLister.add(player);
			}
		}

		return aLister;
	}

	ArrayList<Player> bListers = new ArrayList<Player>();

	public ArrayList<Player> getBListers() {

		for (Player player : players) {
			if ((player.getMatches() >= 50 && player.getMatches() < 100)
					&& (player.getRuns() >= 3000 && player.getRuns() < 5000
							|| player.getWickets() >= 75 && player.getWickets() < 100)) {
				bListers.add(player);
			}
		}

		return bListers;
	}

	public ArrayList<Player> getCListers() {
		ArrayList<Player> cListers = new ArrayList<Player>();

		for (Player player : players) {
			if(!aLister.contains(player) || !bListers.contains(player)) {
				cListers.add(player);
			}
		}
		return cListers;
	}

	public Player getMaxScorerPlayer() {
		Player maxScorer = players.get(0);
		for (Player p : players) {
			if (p.getRuns() > maxScorer.getRuns()) {
				maxScorer = p;
			}
		}
		return maxScorer;
	}

	public Player getMinScorerPlayer() {
		Player minScorer = players.get(0);
		for (Player p : players) {
			if (p.getRuns() < minScorer.getRuns()) {
				minScorer = p;
			}
		}
		return minScorer;
	}

	public Player getMaxWicketerPlayer() {
		Player maxWicketer = players.get(0);
		for (Player p : players) {
			if (p.getWickets() > maxWicketer.getWickets()) {
				maxWicketer = p;
			}
		}
		return maxWicketer;
	}

	public Player getMinWicketerPlayer() {
		Player minWicketer = players.get(0);
		for (Player p : players) {
			if (p.getWickets() < minWicketer.getWickets()) {
				minWicketer = p;
			}
		}
		return minWicketer;
	}

	public void getPlayerDetails(ArrayList<Player> players) {

		for (Player p : players) {
			System.out.println("Player ID : " + p.getId());
			System.out.println("Player Name : " + p.getName());
			System.out.println("Player Played : " + p.getMatches() + " Matches");
			System.out.println("Player Scores : " + p.getRuns() + " Runs");
			System.out.println("Player taken : " + p.getWickets() + " Wickets");
			System.out.println("----------------------------------------");
		}
	}

	public void getPlayerDetail(Player player) {

		System.out.println("Player ID : " + player.getId());
		System.out.println("Player Name : " + player.getName());
		System.out.println("Player Played : " + player.getMatches() + " Matches");
		System.out.println("Player Scores : " + player.getRuns() + " Runs");
		System.out.println("Player taken : " + player.getWickets() + " Wickets");
		System.out.println("----------------------------------------");

	}

}