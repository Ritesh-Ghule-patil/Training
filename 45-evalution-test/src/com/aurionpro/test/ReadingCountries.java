package com.aurionpro.test;

import java.nio.file.Files;
import java.nio.file.Paths;
//import java.util.List;
import java.util.stream.Stream;

public class ReadingCountries {
	public static void main(String[] args) throws Exception {

		System.out.println("Using stream\n");

		System.out.println("------------ Regioons ---------------");
		Stream<String> regions = Files.lines(Paths.get("./lib/region.txt"));
		regions.forEach(System.out::println);


		System.out.println("\n------------ Countries ---------------");
		Stream<String> countries = Files.lines(Paths.get("./lib/countrie.txt"));
		countries.forEach(System.out::println);
		
//		List regions2=Files.lines(Paths.get("./lib/region.txt")).toList();
//		System.out.println("\n____________Regions2 List____________\n");
//		for (Object obj : regions2) {
//			System.out.println(obj);
//		}


//		List countries2=Files.lines(Paths.get("./lib/countrie.txt")).toList();
//		System.out.println("\n________________Countries List____________\n");
//		for (Object obj : countries2) {
//			System.out.println(obj);
//		}

	}

}
