package com.aurionpro.model;

import com.aurionpro.test.ThreadJoinTest;

public class ThreadJoinDemo extends Thread {
	static ThreadJoinTest main ;
	public static void setMain(ThreadJoinTest main) {
		ThreadJoinDemo.main = main;
	}
	@Override
	public void run() {
		 main = new ThreadJoinTest();
		
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Task -> " + i);

		}
	}
}
