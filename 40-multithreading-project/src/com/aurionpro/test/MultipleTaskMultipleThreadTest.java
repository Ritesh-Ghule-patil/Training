package com.aurionpro.test;

import com.aurionpro.model.Thread1;
import com.aurionpro.model.Thread2;
import com.sun.source.tree.Tree;

public class MultipleTaskMultipleThreadTest {
	public static void main(String[] args) throws InterruptedException {

		Thread.currentThread().setName("Ritesh-1");
		System.out.println(Thread.currentThread().getName());
		Thread1 t1 = new Thread1();

		t1.start();
		Thread2 t2 = new Thread2();
		t2.setPriority(8);
		Thread.sleep(10);
		t2.start();
		System.out.println("Main thread -> " + Thread.currentThread().isAlive());
		System.out.println("Thread t1 -> " + t1.isAlive());

	}
}
