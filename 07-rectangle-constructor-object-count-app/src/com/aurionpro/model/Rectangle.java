package com.aurionpro.model;

import java.util.Objects;

public class Rectangle {
	
	private  double height;
	@Override
	public int hashCode() {
		return Objects.hash(color, height, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return color == other.color && Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	private  double width;
	private  ColorType color;
	
	public Rectangle(double height, double width, ColorType color) {
		this.height = validateValue(height);
		this.width = validateValue(width);
		this.color = color;
	}
	
	public Rectangle(double height, double width) {
		this.height = validateValue(height);
		this.width = validateValue(width);
		this.color = color.RED;
	}
	
	public Rectangle() {
		this.height = 10;
		this.width = 20;
		this.color = color.RED;
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
