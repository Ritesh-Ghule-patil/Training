package com.aurionpro.model;

public class AurionproTrainee implements Comparable<AurionproTrainee> {

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

	@Override
	public int compareTo(AurionproTrainee obj) {
		if(this.getRating()>obj.getRating())
			return 1;
		if(this.getRating()==obj.getRating()) {
			return this.getName().compareTo(obj.getName());
		}
			
		return -1;
	}

}
