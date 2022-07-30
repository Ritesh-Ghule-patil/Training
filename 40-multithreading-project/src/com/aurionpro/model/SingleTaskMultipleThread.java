package com.aurionpro.model;

public class SingleTaskMultipleThread extends Thread {

	@Override
	public void run() {
		System.out.println("Thread task....");
	}

	
}
