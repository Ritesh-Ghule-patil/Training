package com.aurionpro.model;

public class SingleTaskSingleThread extends Thread {

	@Override
	public void run() {
		System.out.println("Thread task....");
	}

	
}
