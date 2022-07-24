package com.aurionpro.model;


public class Child extends StatickBlock{
	
	
	static {
		System.out.println("child static block invoked");
	}
	
	public Child() {
		System.out.println("Child Constructor");
	}
	 
}