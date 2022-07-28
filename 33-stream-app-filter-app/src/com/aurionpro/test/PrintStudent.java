package com.aurionpro.test;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PrintStudent {
	public static void main(String[] args) throws Exception {
		
		prinNames();
		System.out.println();
		
		System.out.println("Using stream");
		Stream<String> names = Files.lines(Paths.get("./lib/name.txt"));
		names.forEach(System.out::println);
		
		
	}

	private static void prinNames() throws Exception {
		FileReader in = new FileReader("./lib/name.txt");
		int i;
		while((i=in.read())!=-1) {
			System.out.print((char)i);
		}
		in.close();
	}
	
	
	
}
