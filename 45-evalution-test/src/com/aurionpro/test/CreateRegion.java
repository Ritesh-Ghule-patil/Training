package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class CreateRegion {
	
	public static void main(String[] args) throws FileNotFoundException {

		try (PrintWriter p = new PrintWriter(new FileOutputStream("./lib/region.txt"))) {

			p.print("1, \"Europe\"\r\n"
					+ "2, \"Americas\"\r\n"
					+ "3, \"Asia\"\r\n"
					+ "4, \"Middle East and Africa\"");

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		System.out.println("Region File Created");
	}
	
}
