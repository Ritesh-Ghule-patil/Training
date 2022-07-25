package com.aurionpro.model;

public interface IRepository {
	
	void show();
	
	public default void defaultMethod() {
		System.out.println("in Default method of interface");
	}
	
	public static void display() {
		System.out.println("In static display method of interface");
	}
}
