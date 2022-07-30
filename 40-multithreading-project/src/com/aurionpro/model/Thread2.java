package com.aurionpro.model;

public class Thread2 extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Priority -> "+ Thread.currentThread().getPriority());
		System.out.println("Thread task 2....");
	}

	
}
