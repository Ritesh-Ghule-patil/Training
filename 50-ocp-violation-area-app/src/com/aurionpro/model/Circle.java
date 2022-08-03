package com.aurionpro.model;

public class Circle implements ICalculateArea {

	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double claculateArea() {
		return  Math.PI*(radius*radius) ;
	}

}
