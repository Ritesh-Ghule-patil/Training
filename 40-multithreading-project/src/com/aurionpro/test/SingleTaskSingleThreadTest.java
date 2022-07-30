package com.aurionpro.test;

import com.aurionpro.model.SingleTaskSingleThread;

public class SingleTaskSingleThreadTest {
	public static void main(String[] args) {
		
		SingleTaskSingleThread ss = new SingleTaskSingleThread();
		ss.start();
	}
}
