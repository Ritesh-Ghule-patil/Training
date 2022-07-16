package com.aurionpro.model;

import java.util.Objects;

public class Rectangle {
	
	private  double height;

	private  double width;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public int hashCode() {
		return Objects.hash(height, width);
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
		return Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}
	
	
	
}
