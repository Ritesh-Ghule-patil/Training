package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.PigDiceGame;
import com.aurionpro.model.Player;

public class PigDiceGameTest {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome To pig Diece game : Let's Start teh Game!!\n");
		System.out.println("* See how many turns it takes you to get to 20.");
		System.out.println("* Turn ends when you hold or roll a 1.");
		System.out.println("* If you roll a 1, you lose all points for the turn.");
		System.out.println("* If you hold, you save all points for the turn.\n");
//			
		// Player[] players= new Player[2];
		System.out.print("Please Enter your Name: ");
		String name = sc.next();
//		String name = "RITESH";
		Player player = new Player(name);
//		System.out.print("Player 2, Enter your Name: ");
//		name = sc.next();
//		name = "RIZWAN";
//	    players[1] = new Player(name);

		PigDiceGame game = new PigDiceGame();
		game.play(player);

	}
}
