package com.aurionpro.main;

import com.aurionpro.model.ColorType;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rectangles[] = {
				new Rectangle(-2, 10, ColorType.BLUE),
				new Rectangle(-28, ColorType.RED),
				new Rectangle(-100, 500, ColorType.GREEN),
				new Rectangle(5, 10, ColorType.BLUE),
				new Rectangle(20, 50, ColorType.RED),
				};
		
		for(Rectangle r :rectangles)
			printObjectDetail(r);
		
		Rectangle rect = new Rectangle(2,ColorType.BLUE);
		System.out.println("Number Of object created are : "+ Rectangle.getCountObject());
		
		
		
		
		
	}
		

	public static void printObjectDetail(Rectangle rectangle) {
		System.out.println("bigRectangle height : " + rectangle.getHeight());
		System.out.println("bigRectangle witdh : " + rectangle.getWidth());
		System.out.println("color of rectangle is : " + rectangle.getColor());
		System.out.println("Area of Big Rectangle is : " + rectangle.calculateArea());
		System.out.println("--------------------------------\n");
		
	}
	
	

	
}
