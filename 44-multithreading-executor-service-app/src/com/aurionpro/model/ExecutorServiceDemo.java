package com.aurionpro.model;

public class ExecutorServiceDemo extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Task -> " + i);

		}
		System.out.println();
	}
}
