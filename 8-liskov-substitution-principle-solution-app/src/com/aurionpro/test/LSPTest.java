package com.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Square;

public class LSPTest {
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10,20);
		System.out.println(rectangle);
		
		System.out.println("____________________________________\n");
		
		Square square = new Square(10);
		System.out.println(square);
		
		System.out.println("____________________________________\n");
		
		System.out.println("Area Of rectangle -> "+rectangle.calculateAre());
		

		System.out.println("____________________________________\n");
		
		System.out.println("Area Of Square -> " +square.calculateAre());
		
		System.out.println("____________________________________\n");


	}

}
