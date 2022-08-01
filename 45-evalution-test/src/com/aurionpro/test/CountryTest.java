package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.aurionpro.model.Countries;
import com.aurionpro.model.Region;

public class CountryTest {

	static int id = 0;

	public static void main(String[] args) {

		List<Region> regions = Arrays.asList(new Region(1, "Europe"), new Region(2, "Americas"), new Region(3, "Asia"),
				new Region(4, "Middle East and Africa"));

		List<Countries> countries = Arrays.asList(new Countries("IT", "Italy", 1), new Countries("JP", "Japan", 3),
				new Countries("US", "United States of America", 2), new Countries("CA", "Canada", 2),
				new Countries("CN", "China", 3), new Countries("IN", "India", 3), new Countries("AU", "Australia", 3),
				new Countries("ZW", "Zimbabwe", 4), new Countries("SG", "Singapore", 3),
				new Countries("UK", "United Kingdom", 1), new Countries("FR", "France", 1),
				new Countries("DE", "Germany", 1), new Countries("ZM", "Zambia", 4), new Countries("EG", "Egypt", 4),
				new Countries("BR", "Brazil", 2), new Countries("CH", "Switzerland", 1),
				new Countries("NL", "Netherlands", 1), new Countries("MX", "Mexico", 2),
				new Countries("KW", "Kuwait", 4), new Countries("IL", "Israel", 4), new Countries("DK", "Denmark", 1),
				new Countries("HK", "HongKong", 3), new Countries("NG", "Nigeria", 4),
				new Countries("AR", "Argentina", 2), new Countries("BE", "Belgium", 1));

		Map<Integer, List<String>> countriesByCode = countries.stream().collect(
				Collectors.groupingBy(Countries::getId, Collectors.mapping(Countries::getName, Collectors.toList())));
		
		System.out.println("----------- 1. Countries By theirs Id : ---------------\n");
		countriesByCode.forEach((k, v) -> System.out.println(k + " = " + v));

		System.out.println("\n______________ Countries In region ____________________________________________\n");
		int i = 0;
		for (Entry<Integer, List<String>> entry : countriesByCode.entrySet()) {
			System.out.println(regions.get(i).getName() + " : " + entry.getValue().size());
			i++;
		}

		System.out.println("\n______________________ County and Region Name By Code __________________________\n");

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("3. Enter the country code :");
		String code = sc.next();

		String countryName = "";
		for (Countries con : countries) {
			if (con.getCode().equalsIgnoreCase(code)) {
				countryName = con.getName();
				id = con.getId();
			}
		}
		System.out.print(countryName);
		regions.stream().filter(a -> a.getId() == id).forEach(a -> System.out.println(" " + a.getName()));

	}
}
