package com.player.model;

public class Player {
	
	private int id;
	private final String name;
	private int matches;
	private int runs;
	private int wickets;
	
	public Player(int id, String name, int matches, int runs, int wickets) {
		this.id = id;
		this.name = name;
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", matches=" + matches + ", runs=" + runs + ", wickets="
				+ wickets + "]";
	}
	
	
	

}
