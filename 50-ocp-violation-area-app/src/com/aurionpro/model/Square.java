package com.aurionpro.model;

public class Square implements ICalculateArea {

	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double claculateArea() {
		return side*side;
	}

}
