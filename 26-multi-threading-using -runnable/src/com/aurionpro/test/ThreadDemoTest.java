package com.aurionpro.test;

import com.aurionpro.model.ThreadDemo;

public class ThreadDemoTest {
	public static void main(String[] args) {
		
		ThreadDemo test = new ThreadDemo();
		Thread thread = new Thread(test);
		
		thread.start();
		
		//thread.start();
	}
}
