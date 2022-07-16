package com.aurionpro.model;

public class Bmi {
	Person person;
	Double bmi;

	public Bmi(Person person) {
		this.person = person; // setting up person obj value to instance variable person
		this.bmi = calculateBmi();
	}

	private double calculateBmi() {

		double height = person.getHeight() / 100;
		return person.getWeight() / (height * height);

	}

	public String getBodyType() {
		
		if (bmi < 18.5)
			return "UnderWeigth";
		
		if (bmi > 18.50 && bmi < 24.99) 
			return "Normal";
		
		return "OverWeight";
	}

	public Double getBmi() {
		return bmi;
	}

}
