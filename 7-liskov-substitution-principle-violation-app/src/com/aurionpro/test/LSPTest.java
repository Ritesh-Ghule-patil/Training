package com.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Square;

public class LSPTest {
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10,20);
		System.out.println(rectangle);
		
		Square square = new Square(10);
		System.out.println(square);
		
		System.out.println("__________________________\n");
		
		if(isRectangle(rectangle)) {
			System.out.println("it is Rectangle Type");
		}
		else {
			System.out.println("Not Rectangle Type");
		}
		
		System.out.println("__________________________\n");
		
		if(isRectangle(square)) {
			System.out.println("it is Rectangle Type");
		}
		else {
			System.out.println("Not Rectangle Type");
		}
	}

	private static boolean isRectangle(Rectangle obj) {
		double prev = obj.getWidth();
		obj.setHeight(5);
		return obj.getWidth()==prev;
	}
}
