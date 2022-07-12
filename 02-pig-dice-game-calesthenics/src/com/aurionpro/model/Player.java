package com.aurionpro.model;

public class Player {

	private final String name;
	private int turn = 1;
	private int turnScore;
	private int totalScore;

	public Player(String name) {
		this.name = name;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public int getTurnScore() {
		return turnScore;
	}

	public void setTurnScore(int turnScore) {
		this.turnScore = turnScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public String getName() {
		return name;
	}

	public void printDetail() {
		System.out.println("\n----------Player Detail-----------\n");
		System.out.println("Hello " + this.getName());
		System.out.println("your current turn Score is : " + this.getTurnScore());
		System.out.println("your Total Score is : " + this.getTotalScore());
		System.out.println("\n----------------------------------\n");
		this.setTurnScore(0);

	}

}
