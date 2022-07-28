package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListFilter {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(10,20,20,20,23,34,45,66,76,77);
		List<Integer> unique = new ArrayList<>();
		int count=0;
		for (Integer ele : number) {
			if(count<=5 && ele%2==0) {
				if(!unique.contains(ele)) {
					unique.add(ele);
					count++;
				}
			}
		}
		
		System.out.println(unique);
		
		System.out.println("evenList\n");
		
		List<Integer> evenList =number.stream()
									.filter(n->n%2==0)
									.distinct()
									.collect(Collectors.toList());
		
		evenList.stream().forEach(System.out::println);
		
		
		
		//System.out.println("\nEven using stream ");
		//number.stream().filter(n->n%2==0).forEach(System.out::println);
//		
//		number.stream()
//			.filter(n->n%2==0)
//			.limit(5)
//			.distinct()
//			.forEach(n->System.out.println(n));
		
		
	
	}
}