package com.aurionpro.model;

public class InterThreadCommunication extends Thread {

	private int total = 0;

	public int getTotal() {
		return total;
	}

	public void run() {

		synchronized (this) {
			for (int i = 0; i < 5000; i++)
				total += 100;
			this.notify();
		}

	}

}
