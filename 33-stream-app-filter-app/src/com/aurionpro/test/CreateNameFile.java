package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class CreateNameFile {

	public static void main(String[] args) throws FileNotFoundException {

		try (PrintWriter p = new PrintWriter(new FileOutputStream("./lib/name.txt"))) {
			p.println("Ritesh");
			p.println("Ashish");
			p.println("Harshal");
			p.println("Pratik");
			p.println("Shubahm");

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		System.out.println("File Created");
	}

}
