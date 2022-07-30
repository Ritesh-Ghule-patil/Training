package com.aurionpro.model;

import java.util.ArrayList;

public class Invoice {
	ArrayList<Product> products;
	ArrayList<Double> taxesList = new ArrayList<Double>();
	ArrayList<Double> discountsList = new ArrayList<Double>();
	ArrayList<Double> totalPriceList = new ArrayList<Double>();
	double totalcost;

	public Invoice(ArrayList<Product> products) {

		this.products = products;

		this.taxesList = calculateTax();
		this.discountsList = calculateDiscount();
		this.totalPriceList = invoiceTotalPrice();
		this.totalcost = totalprices();

	}

	public double getTotalcost() {
		return totalcost;
	}

	public void display() {

		InvoicePrinter print = new InvoicePrinter();
		print.printDetails(this);

	}

	public ArrayList<Double> calculateTax() {

		for (Product p : products) {
			taxesList.add((p.getAmount() * p.getTax()) / 100);
		}

		return taxesList;

	}

	public ArrayList<Double> calculateDiscount() {

		for (Product p : products) {
			discountsList.add((p.getAmount() * p.getDiscountPercent()) / 100);
		}

		return discountsList;

	}

	public ArrayList<Double> invoiceTotalPrice() {

		for (int j = 0; j < products.size(); j++) {

			totalPriceList.add(products.get(j).getAmount() + taxesList.get(j) - discountsList.get(j));
		}

		return totalPriceList;

	}

	public double totalprices() {

		for (Double price : totalPriceList) {
			totalcost += price;
		}

		return totalcost;
	}

	public ArrayList<Double> getAlltaxes() {
		return taxesList;
	}

	public ArrayList<Double> getAlldiscount() {
		return discountsList;
	}

	public ArrayList<Double> getAlltotalPrice() {
		return totalPriceList;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

}