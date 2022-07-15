package com.aurionpro.model;

public class Rectangle {
	
	private double height;
	private double width;
	private ColorType color;
	
	public Rectangle(double height, double width, ColorType color) {
		this.height = validateValue(height);
		this.width = validateValue(width);
		this.color = color;
	}
	
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public ColorType getColor() {
		return color;
	}

	public double calculateArea() {
		return height*width;
	}
	
	private static double validateValue(double value) {
		if(value<=0) {
			return 1;
		}
		if(value>100) {
			return 100;
		}
		return value;
	}

}
