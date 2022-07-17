package com.aurionpro.main;

import java.util.Scanner;

import com.aurionpro.model.ColorType;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Rectangles : ");
		int number = sc.nextInt();
		Rectangle rectangles[] = new Rectangle[number];

		for (int i = 0; i < rectangles.length; i++) {

			System.out.print("Enter the height of rectangle :");
			int height = sc.nextInt();
			System.out.print("Enter the width of rectangle :");
			int width = sc.nextInt();
			System.out.print("Enter the color of rectangle :");
			ColorType color;
			try {
				color = ColorType.valueOf(sc.next().toUpperCase());
			} catch (IllegalArgumentException e) {
				color = ColorType.RED;
			}

			rectangles[i] = new Rectangle(height, width, color);
			System.out.println("-------------------------------------");

		}

		for (Rectangle r : rectangles) {
			printObjectDetail(r);
			System.out.println("-----------------------------------------");
		}

	}

	public static void printObjectDetail(Rectangle rectangle) {
		System.out.println("bigRectangle height : " + rectangle.getHeight());
		System.out.println("bigRectangle witdh : " + rectangle.getWidth());
		System.out.println("color of rectangle is : " + rectangle.getColor());
		System.out.println("Area of Big Rectangle is : " + rectangle.calculateArea());

	}

}
