package com.aurionpro.test;

import com.aurionpro.model.ThreadYieldDemo;

public class ThreadYieldTest {
	public static void main(String[] args) throws InterruptedException {

		ThreadYieldDemo t1 = new ThreadYieldDemo();
		t1.start();
		
		//Thread.yield();
		for (int i = 1; i <= 500; i++) {
			
			System.out.println(i);
		}

	}
}
