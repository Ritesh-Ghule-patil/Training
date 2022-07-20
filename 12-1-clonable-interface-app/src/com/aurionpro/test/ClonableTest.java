package com.aurionpro.test;

import com.aurionpro.model.ClonableDemo;

public class ClonableTest  {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("--------  Shallow Copy -----------\n");
		ClonableDemo c1 = new ClonableDemo();
		c1.a= 10;
		c1.b = 20;
		System.out.println(c1.toString());

		ClonableDemo c2 = c1;
		System.out.println(c2.toString());
		System.out.println("\n--Change in one reflect to other--\n");
		
		c2.a = 0;
		System.out.println(c2.toString());
		System.out.println(c1.toString()+"\n");
//		System.out.println(c1.hashCode());
//		System.out.println(c2.hashCode());
		
		System.out.println("\n----------- Deep Copy -----------\n");
		//Hard to maitain what if we have 20-30 attributes
		ClonableDemo c3 = new ClonableDemo();
		c3.a = 10;
		c3.b = 20;
		
		ClonableDemo c4 = new ClonableDemo();
		c4.a = c3.a;
		c4.b = c3.b;
		
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		
		System.out.println("\n--Changes do not reflect to other--\n");

		
		c3.a=0;
		System.out.println(c3.toString()); //[0,20]
		System.out.println(c4.toString()+"\n"); //[10,20]
		
//		System.out.println(c3.hashCode());
//		System.out.println(c4.hashCode());
		

		System.out.println("\n------ using Clone method -------\n");
		
		ClonableDemo c5 = new ClonableDemo();
		c5.a = 50;
		c5.b = 100;
		
		ClonableDemo c6 = (ClonableDemo)c5.clone();
		
		System.out.println(c5.toString());
		System.out.println(c6.toString());
		
		c5.a = 10;
		
		System.out.println("\n--- Changing one object value ---\n");
		System.out.println(c5.toString());
		System.out.println(c6.toString()+"\n");
		
//		System.out.println(c5.hashCode());
//		System.out.println(c5.hashCode());
	}

}
