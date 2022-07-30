package com.aurionpro.test;

import com.aurionpro.model.ThreadJoinDemo;

public class ThreadJoinTest {

	public static void main(String[] args) throws InterruptedException {

		ThreadJoinDemo t1 = new ThreadJoinDemo();
		t1.start();
		//t1.join();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

		}

	}

}
