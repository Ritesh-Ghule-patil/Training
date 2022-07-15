package com.aurionpro.main;

import com.aurionpro.model.ColorType;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle(10, 101, ColorType.BLUE);
		printObjectDetail(smallRectangle);

		System.out.println("-----------------------------------------\n");

		Rectangle bigRectangle = new Rectangle(10, 101, ColorType.BLUE);
		printObjectDetail(bigRectangle);
		
		System.out.println("-----------------------------------------\n");
		
		Rectangle defaultRectangle = new Rectangle();
		printObjectDetail(defaultRectangle);
		
		System.out.println(smallRectangle.equals(bigRectangle));
	}

	public static void printObjectDetail(Rectangle rectangle) {
		System.out.println("bigRectangle height : " + rectangle.getHeight());
		System.out.println("bigRectangle witdh : " + rectangle.getWidth());
		System.out.println("color of rectangle is : " + rectangle.getColor());
		System.out.println("Area of Big Rectangle is : " + rectangle.calculateArea());
	}

}
