package com.aurionpro.model;

public class Rectangle {
	
	private double height;
	private double width;
	private String color;
	
	public Rectangle(double height, double width, String color) {
		this.height = validateValue(height);
		this.width = validateValue(width);
		this.color = validatecolor(color);
		
	}
	private String validatecolor(String color) {
		if(color.toLowerCase().equals("green") || color.equalsIgnoreCase("blue"))
			return color.toLowerCase() ;
		return "red";
		
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
	
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public String getColor() {
		return color;
	}

	public double calculateArea() {
		return height*width;
	}

}
