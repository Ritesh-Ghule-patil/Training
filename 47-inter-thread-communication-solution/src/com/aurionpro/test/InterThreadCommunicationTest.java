package com.aurionpro.test;

import com.aurionpro.model.InterThreadCommunication;

public class InterThreadCommunicationTest {
	public static void main(String[] args) throws InterruptedException {
		
		InterThreadCommunication itc = new InterThreadCommunication();
		itc.start();
		synchronized (itc) {
			itc.wait();
			System.out.println(itc.getTotal());
		}
	}
}
