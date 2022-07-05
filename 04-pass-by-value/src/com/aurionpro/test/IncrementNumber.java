package com.aurionpro.test;

public class IncrementNumber {
	public static void main(String[] args) {
		
		int num = 10;
		System.out.println("Before increment : "+num);
		int a  = incrementNumber(num);
		System.out.println("After Incrementing : "+a);
		
	}
	
	public static int  incrementNumber(int num) {
		return ++num;
		//System.out.println(num);
		
	}
}
