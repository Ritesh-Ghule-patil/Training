package com.aurionpro.case2;

public class Parent {
	
private int foo;

	public Parent() {
		this(100);

	}
	
	public Parent(int foo){
		
		this.foo = foo;
		System.out.println("value of foo is:" +foo);
		
	}
	
	public int getFoo() {
		return foo;
	}

}
