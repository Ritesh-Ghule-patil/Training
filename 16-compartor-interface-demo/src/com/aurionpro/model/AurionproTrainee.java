package com.aurionpro.model;

public class AurionproTrainee {

	private int id;
	private String name;
	private double rating;

	public AurionproTrainee(int id, String name, double rating) {
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "AurionproTrainee [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}

}
