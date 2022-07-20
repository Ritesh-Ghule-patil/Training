package com.aurionpro.model;

public class ClonableDemo implements Cloneable {

	public int a;
	public int b;

	@Override
	public String toString() {
		return "ClonableDemo [a=" + a + ", b=" + b + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	
}
