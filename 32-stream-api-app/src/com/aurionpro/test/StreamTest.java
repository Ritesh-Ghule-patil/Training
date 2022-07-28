package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public class StreamTest {
	public static void main(String[] args) {
		
		Stream<Integer> number = Stream.of(10,20,30,40,50);
		number.forEach((n)-> System.out.println(n));
		
		Stream<String> palyer = Stream.of("Scahin","Rohit","Dhoni");
		palyer.forEach((n)-> System.out.println(n));
		
		List <Integer> list = Arrays.asList(10,20,30,40,50);
		
		Optional<Double> total = Stream.of(1.2,33.4,556.4)
					.reduce((a,b)->a+b);
		
		System.out.println("total = "+total);
		

	}
}

