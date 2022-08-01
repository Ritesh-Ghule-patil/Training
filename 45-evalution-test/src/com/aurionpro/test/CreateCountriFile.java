package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class CreateCountriFile {

	public static void main(String[] args) throws FileNotFoundException {

		try (PrintWriter p = new PrintWriter(new FileOutputStream("./lib/countrie.txt"))) {

			p.print("\"IT\", \"Italy\", 1\r\n" + "\"JP\", \"Japan\", 3\r\n"
					+ "\"US\", \"United States of America\", 2\r\n" + "\"CA\", \"Canada\", 2\r\n"
					+ "\"CN\", \"China\", 3\r\n" + "\"IN\", \"India\", 3\r\n" + "\"AU\", \"Australia\", 3\r\n"
					+ "\"ZW\", \"Zimbabwe\",4\r\n" + "\"SG\", \"Singapore\", 3\r\n"
					+ "\"UK\", \"United Kingdom\", 1\r\n" + "\"FR\", \"France\", 1\r\n" + "\"DE\", \"Germany\", 1\r\n"
					+ "\"ZM\", \"Zambia\", 4\r\n" + "\"EG\", \"Egypt\", 4\r\n" + "\"BR\", \"Brazil\", 2\r\n"
					+ "\"CH\", \"Switzerland\", 1\r\n" + "\"NL\", \"Netherlands\", 1\r\n" + "\"MX\", \"Mexico\", 2\r\n"
					+ "\"KW\", \"Kuwait\", 4\r\n" + "\"IL\", \"Israel\", 4\r\n" + "\"DK\", \"Denmark\", 1\r\n"
					+ "\"HK\", \"HongKong\", 3\r\n" + "\"NG\", \"Nigeria\", 4\r\n" + "\"AR\", \"Argentina\", 2\r\n"
					+ "\"BE\", \"Belgium\", 1");

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		System.out.println("Country File Created");
	}
}
