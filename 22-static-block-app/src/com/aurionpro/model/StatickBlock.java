package com.aurionpro.model;

public class StatickBlock {
	
	static {
		System.out.println("Parent static block invoked");
	}
	public StatickBlock() {
		System.out.println("parent Constructor");
	}
}


