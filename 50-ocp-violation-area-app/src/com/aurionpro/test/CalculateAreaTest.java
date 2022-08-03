package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Square;

public class CalculateAreaTest {
	public static void main(String[] args) {
		
		Circle circle= new Circle(10);
		System.out.print("Area of circle :");
		System.out.println(circle.claculateArea());
		
		Rectangle rectangle = new Rectangle(10, 5);
		System.out.print("Area of rectangle :");
		System.out.println(rectangle.claculateArea());
		
		Square squre = new Square(5);
		System.out.print("Area of Square :");
		System.out.println(squre.claculateArea());
	}
}
