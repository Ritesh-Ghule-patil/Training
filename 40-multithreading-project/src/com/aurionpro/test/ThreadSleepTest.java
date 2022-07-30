package com.aurionpro.test;

import com.aurionpro.model.ThreadSleepDemo;

public class ThreadSleepTest {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		ThreadSleepDemo t1 = new ThreadSleepDemo();
		t1.start();
		
		for(int i=1; i<=10; i++) {
			Thread.sleep(500);
			System.out.println(i);
		}
		
	}
}
