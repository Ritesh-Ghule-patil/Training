package com.aurionpro.main;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle smallRectangle = new Rectangle();
		smallRectangle.setHeight(10);
		smallRectangle.setWidth(20);
		printObjectDetail(smallRectangle);

		Rectangle bigRectangle = new Rectangle();
		bigRectangle.setHeight(100);
		bigRectangle.setWidth(20);
		printObjectDetail(bigRectangle);

	}

	public static void printObjectDetail(Rectangle obj) {
		System.out.println("bigRectangle height : " + obj.getHeight());
		System.out.println("bigRectangle height : " + obj.getWidth());
		System.out.println("Area of Big Rectangle is : " + obj.calculateArea());
		System.out.println("-----------------------------------------");
	}

}
