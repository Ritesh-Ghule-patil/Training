package com.aurionpro.model;

public class ThreadYieldDemo extends Thread {

	@Override
	public void run() {
		//Thread.yield();
		
		for(int i=1; i<=10; i++) {
			System.out.println("Task -> "+ i);
			
		}
	}
}
