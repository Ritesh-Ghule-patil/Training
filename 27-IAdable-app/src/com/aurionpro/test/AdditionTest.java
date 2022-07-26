package com.aurionpro.test;

import com.aurionpro.model.AdditionClass;
import com.aurionpro.model.IAddable;

public class AdditionTest {
	public static void main(String[] args) {

		IAddable t = new AdditionClass();
		System.out.println("Simple add calling " + t.add(10, 20));

		IAddable t2 = new IAddable() {

			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};

		System.out.println("Calling from Ananymous class " + t2.add(100, 200));

		IAddable t3 = AdditionTest::addition;
		System.out.println("Calling from Static reference " + t3.add(200, 200));

		IAddable t4 = (a, b) -> {return a + b;};

		System.out.println("Calling by lambda function " + t4.add(500, 500));

	}

	private static int addition(int i, int j) {
		return i + j;
	}

}
