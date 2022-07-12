package com.aurionpro.model;

import java.util.Random;
import java.util.Scanner;

public class PigDiceGame {
	static Scanner sc = new Scanner(System.in);
	public void play(Player player) {
		System.out.println("\n" + player.getName() + "'s Turn");
		System.out.println("TURN : " + player.getTurn());

		while ((player.getTotalScore() + player.getTurnScore()) < 20) {
			keepPlaying(player);
		}
		System.out.println("\n-----------Game-End--------------\n");
		System.out.println("Congrats " + player.getName() + " You Won!!!");
		winnerDetail(player);
	}

	private void keepPlaying(Player player) {
		System.out.print("Roll or Hold (r/h): ");
		String choice;
		choice = sc.next();

		if (choice.equalsIgnoreCase("r")) {
			roll(player);
		} else if (choice.equalsIgnoreCase("h")) {
			hold(player);

		} else {
			System.err.println("Invlid input!!!.");
			System.out.println("Please Enter correct input.");

		}

	}

	private void roll(Player player) {
		int score = getDiceScore();
		System.out.println("you get : " + score);
		if (score == 1) {
			updateTurnScoreToZero(player);
		} else {
			player.setTurnScore(player.getTurnScore() + score);
		}
	}

	public int getDiceScore() {
		Random rand = new Random();
		return rand.nextInt(6 - 1) + 1;
	}

	private void updateTurnScoreToZero(Player player) {
		System.out.println("\n----------------------------------");
		player.setTurnScore(0);
		System.out.println("Your Turn Ends!!");
		System.out.println("You Loose your Current Turn Score.");
		player.setTurn(player.getTurn() + 1);

		player.printDetail();
		System.out.println("TURN " + (player.getTurn()));

	}

	private void hold(Player player) {
		player.setTotalScore(player.getTotalScore() + player.getTurnScore());
		player.setTurn(player.getTurn() + 1);
		player.printDetail();
		System.out.println("TURN " + (player.getTurn()));

	}

	private void winnerDetail(Player player) {
		player.setTotalScore(player.getTotalScore() + player.getTurnScore());
		System.out.println("\n----------Winner Detail-----------\n");
		System.out.println("Hello " + player.getName());
		System.out.println("your current turn Score is : " + player.getTurnScore());
		System.out.println("your Total Score is : " + player.getTotalScore());
		System.out.println("Total turns Taken To Win : " + player.getTurn());
		System.out.println("\n----------------------------------");

	}

}
