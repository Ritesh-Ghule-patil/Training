package com.aurionpro.assignments;

import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class DislpayClassAttributes {
	public static void main(String[] args) {
		Field field[] = Object.class.getDeclaredFields();
		System.out.println("List of Field of a class");
		int number =0;
		for(Field f : field) {
			System.out.println(++number +". "+ f);
		}
		
		System.out.println("\n");
		Method[] methods = Object.class.getDeclaredMethods();
		System.out.println("List of Methods of a class");
		number =0;
		for(Method m : methods) {
			System.out.println(++number +". "+ m);
		}
	}
}
