package com.aurionpro.model;

public class OuterClass {
	
	private int a;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	 public class InnerClass{
		
		public int b;

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}
		
	}
	
	 public static class StaticInnerclass{
		public int c;
	}
}
