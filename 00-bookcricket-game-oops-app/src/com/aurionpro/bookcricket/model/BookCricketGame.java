package com.aurionpro.bookcricket.model;

import java.util.Scanner;

public class BookCricketGame {

	public void play(Player[] players) {

		Book book = new Book();

		Scanner sc = new Scanner(System.in);

		for (Player player : players) {
			System.out.println("Welcome : " + player.getPlayerName());
			System.out.println("\n*****************************************");

			int choice = 0;
			int pageNumber = 0;
			int turnScore = 0;

			do {

				System.out.print("Enter 1 to open the Book : ");
				choice = sc.nextInt();

				if (choice == 1) {
					pageNumber = book.getPageNumber();
					turnScore = pageNumber % 7;
					// if turnscore ==0 display something
					player.setScore(player.getScore() + turnScore);
					player.setRounds(player.getRounds() + 1);
					printTurnDetails(player, turnScore);

					if (turnScore == 0) {
						System.out.println(players[0].getPlayerName() + " Scored : " + players[0].getScore() + " Runs in "
								+ players[0].getRounds() + " Rounds");
						System.out.println(players[1].getPlayerName() + " You Have a Target of Score : "
								+ (players[0].getScore() + 1)+ " Runs");
						System.out.println("\n*****************************************");

					}

				} else {
					System.err.println("invalid input!!!. Try again ");
					continue;
				}

			} while (turnScore != 0 && players[0].getScore() >= players[1].getScore());
		}
	}

	private void printTurnDetails(Player player, int turnScore) {
		System.out.println("Turn Score is : " + turnScore);
		System.out.println("Total Score is : " + player.getScore());
		System.out.println("Total rounds are : " + player.getRounds());
		System.out.println("-----------------------------------------");
	}

	public void whoIsWinner(Player[] players) {
		Player winner;
		System.out.println("\nThank you for playing, Let's See the result");
		if (players[0].getScore() > players[1].getScore()) {
			winner = players[0];
		} else if (players[0].getScore() == players[1].getScore()) {
			
			if(players[0].getRounds() < players[1].getRounds()) {
				System.out.println("both Player has scored same runs in equals round!! Match is tie");
			}
			if (players[0].getRounds() < players[1].getRounds()) {
				winner = players[0];
			} else {
				winner = players[1];
			}
		} else {
			winner = players[1];
		}
		matchSummary(players);
		System.out.println("Congratulation " + winner.getPlayerName() + " you wins!!!");
	}

	private void matchSummary(Player[] players) {

		System.out.println("Here is the Mtach Summary : ");
		int no = 1;
		for (Player player : players) {
			System.out.println("Player" + no + " Name : " + player.getPlayerName());
			System.out.println("Player" + no + " Score is : " + player.getScore());
			System.out.println("Rounds" + no + " Taken are : " + player.getRounds());
			no++;
			System.out.println("------------------------------------");
		}
//		System.out.println(players[1].getPlayerName() +" You Have a Target of : "+ players[0].getScore()+1);
	}

}
