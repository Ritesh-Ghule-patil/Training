package com.aurionpro.test;

import com.aurionpro.model.SingleTaskSingleThread;

public class SingleTaskMultipleThreadTest {
	public static void main(String[] args) {
		
		SingleTaskSingleThread sst = new SingleTaskSingleThread();
		sst.start();
		SingleTaskSingleThread smt = new SingleTaskSingleThread();
		smt.start();
	}
}
