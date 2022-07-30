package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.Invoice;
import com.aurionpro.model.Product;

public class ProductTest {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<>();

		products.add(new Product("101", "Lenovo ThinkBook", 40000, 18, 5));
		products.add(new Product("102", "Dell inspiron", 50000, 18, 7));
		products.add(new Product("103", "Hp pavellion", 70000, 18, 5));
		products.add(new Product("104", "MacBook Air", 120000, 18, 10));
		products.add(new Product("105", "Lenovo ThinkPad", 35000, 18, 5));

		Invoice invoice = new Invoice(products);
		invoice.display();

	}

}