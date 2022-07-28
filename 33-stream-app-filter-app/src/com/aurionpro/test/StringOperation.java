package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringOperation {
	public static void main(String[] args) {
//a. print names of first 3 students sorted in ascending order
// b. print names of first 3 students sorted in ascending order if their names contain 'a'
// c. print names of students sorted in descending order
// d. print first 3 characters of names of students
// e. print the names of the students that contains less than or equal to 4 characters
		System.out.println("a. print names of first 3 students sorted in ascending order");

		List<String> names = Arrays.asList("Jay", "Nilesh", "Mark", "Ritesh", "Ramesh");
//		Collections.sort(names);
//		for (int i = 0; i < 3; i++) {
//			System.out.println(names.get(i));
//		}

		names.stream()
			.sorted()
			.limit(3)
			.forEach(System.out::println);
		System.out.println("_______________________________________________");

		System.out.println("b. print names of first 3 students sorted in ascending order if their names contain 'a'\r\n" + "");

//		int count =0;
//		char ch = 'a';
//		for ( String name : names) {
//			if(count<3 && name.contains("a"))
//			{
//				count++;
//				System.out.println(name);
//			}
//		}

		names.stream().sorted().filter(name -> name.contains("a")).limit(3).forEach(System.out::println);

		System.out.println("_______________________________________________");

		System.out.println("c. print names of students sorted in descending order\r\n" + "");

//		for (int i = names.size()-1; i >names.size()-4; i--) {
//			System.out.println(names.get(i));
//		}

		names.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

		System.out.println("_______________________________________________");

		System.out.println("d.print first 3 characters of names of students");

		names.stream().map(name -> name.substring(0, 3)).forEach(System.out::println);

		System.out.println("_______________________________________________");

		System.out.println("e. print the names of the students that contains less than or equal to 4 characters");

//		for (String name : names) {
//			if(name.length()<=4) {
//				System.out.println(name);
//			}
//		}
//		System.out.println("\nprints names whose length <=4 \n");
		names.stream().filter((name -> name.length() <= 4)).forEach(System.out::println);

	}
}
