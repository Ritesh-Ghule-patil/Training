package com.aurionpro.test;

public class EcxceptionTest {
	public static void main(String[] args) {

		int c=0;
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			c = a / b;
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException Handel");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Handel");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Handel");
		}
		finally {
			System.out.println("I am finally bloclk : I Excecute Always");
		}
		
		System.out.println("Division is : " + c);
	}

}
