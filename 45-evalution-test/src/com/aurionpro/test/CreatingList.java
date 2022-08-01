package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Countries;
import com.aurionpro.model.Region;

public class CreatingList {

	static List<Region> regions = new ArrayList<>();
	static List<Countries> countries = new ArrayList<>();

	public static void main(String[] args) throws IOException {

		getRegionList();
		System.out.println("--------------- Region List -------------\n");
		for (Region region : regions) {
			System.out.println(region.getId() + " " + region.getName());
		}

		getountryList();
		System.out.println("\n--------------- Country List ------------\n");
		for (Countries country : countries) {
			System.out.println(country.getCode() + " " + country.getName() + " " + country.getId());
		}
	}

	private static void getRegionList() throws FileNotFoundException {
		FileInputStream in = new FileInputStream("./lib/region.txt");
		Scanner sc = new Scanner(in);
		while (sc.hasNextLine()) {
			String regionDetail = sc.nextLine().replace("\"", "").replace(" ", "");
			String[] regionArray = regionDetail.split(",");
			int id = Integer.valueOf(regionArray[0]);
			String regionName = regionArray[1];

			regions.add(new Region(id, regionName));
		}
	}

	private static void getountryList() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("./lib/countrie.txt");
		Scanner sc = new Scanner(fis);
		while (sc.hasNextLine()) {
			String countryDetail = sc.nextLine().replace("\"", "").replace(" ", "");
			String[] countryDetails = countryDetail.split(",");
			String countryCode = countryDetails[0];
			String countryName = countryDetails[1];
			int countryId = Integer.valueOf(countryDetails[2]);

			countries.add(new Countries(countryCode, countryName, countryId));

		}
	}

}
