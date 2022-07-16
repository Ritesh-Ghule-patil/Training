package com.aurionpro.main;


import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(10,30);
		Rectangle rect2 = new Rectangle(10, 20);
		
		System.out.println(rect1.equals(rect2));
		System.out.println(rect1.hashCode());
		System.out.println(rect2.hashCode());
//		System.out.println(rect1==rect2);
	}

	

}
