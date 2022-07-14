package com.aurionpro.main;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle(-2, 101, "BLUE");
		printObjectDetail(smallRectangle);

		System.out.println("-----------------------------------------");

		Rectangle bigRectangle = new Rectangle(-200, 20, "yellow");
		printObjectDetail(bigRectangle);
	}

	public static void printObjectDetail(Rectangle rectangle) {
		System.out.println("bigRectangle height : " + rectangle.getHeight());
		System.out.println("bigRectangle witdh : " + rectangle.getWidth());
		System.out.println("color of rectangle is : " + rectangle.getColor());
		System.out.println("Area of Big Rectangle is : " + rectangle.calculateArea());
	}

}
