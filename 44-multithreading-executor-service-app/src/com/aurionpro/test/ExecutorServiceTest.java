package com.aurionpro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.aurionpro.model.ExecutorServiceDemo;

public class ExecutorServiceTest {
	public static void main(String[] args) {
		
		int count = Runtime.getRuntime().availableProcessors();
		System.out.println("number of processer " +count);
		
		ExecutorService service = Executors.newSingleThreadExecutor();  
		//ExecutorService service = Executors.newFixedThreadPool(3);
		//ExecutorService service = Executors.newCachedThreadPool(); 
		
		
		service.execute(new ExecutorServiceDemo());
		service.execute(new ExecutorServiceDemo());
		service.execute(new ExecutorServiceDemo());
		
		
		service.shutdown();
		
		
	}
}
