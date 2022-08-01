package com.aurionpro.model;

public class InterThreadCommunication extends Thread {

	private int total = 0;

	public int getTotal() {
		return total;
	}

	 public void run() {
		for (int i = 0; i < 10; i++) 
			total += 100;
		
	}

}
