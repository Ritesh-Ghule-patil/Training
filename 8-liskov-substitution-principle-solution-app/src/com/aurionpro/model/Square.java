package com.aurionpro.model;

public class Square implements IShape {
	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double calculateAre() {
		return side*side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	
	
}
