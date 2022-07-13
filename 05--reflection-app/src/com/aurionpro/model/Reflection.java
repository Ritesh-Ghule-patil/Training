package com.aurionpro.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
			
	public static void getDetail(Class<?> inputClass) throws NoSuchMethodException, SecurityException
	{
		System.out.print("\nName of the Class is : "+ inputClass.getName() +"\n \n" );
		System.out.println("-----------------------------------------------------------------------------\n");
		
		Field fields[] = inputClass.getDeclaredFields();
		System.out.println("List of Field of -> "+ inputClass.getName() +" Class Are ->\n");
		int number =0;
		for(Field field : fields) {
			System.out.println(++number +". "+ field);
		}
		System.out.println("\n---------------------------------------------------------------------------\n");
		
		System.out.println("List of Methods of -> "+ inputClass.getName() +" Class Are ->\n" );
		
		Method[] methods = inputClass.getDeclaredMethods();
		number =0;
		for(Method method : methods) {
			System.out.println(++number +". "+ method);
		}
		
		System.out.println("\n---------------------------------------------------------------------------\n");
		System.out.println("Constructor of -> "+ inputClass.getName() +" Class is ->\n" );
		
		Constructor<?> constructor = inputClass.getConstructor();
		
		System.out.println(constructor);
		
	}
	
}
