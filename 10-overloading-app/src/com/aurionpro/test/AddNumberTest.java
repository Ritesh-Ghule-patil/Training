package com.aurionpro.test;

import com.aurionpro.model.AddNumbers;

public class AddNumberTest {
	public static void main(String[] args) {
		
		AddNumbers obj = new AddNumbers();
		
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20,30));
		System.out.println(obj.add(10.0, 12.5, 5.5));
		
	}
}
