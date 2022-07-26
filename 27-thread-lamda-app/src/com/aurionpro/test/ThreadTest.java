package com.aurionpro.test;

public class ThreadTest {

	public static void main(String[] args) {

		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("inside Anonymous class");
			}
		};
		
		Thread t = new Thread(r1);
		t.start();

		//Static reference
		Runnable r2 = ThreadTest::execute;
		r2.run();

		//lambda function
		Runnable r3 = () -> System.out.println("lamda thread created");
		r3.run();

	}

	private static void execute() {
		System.out.println("Inside Static reference");
	}

}
