package com.aurionpro.model;

public class Invoice {

	public double calculatetax(Product product) {
		return (product.getAmmount() * product.getTax()) / 100;
	}

	public double calculateDiscount(Product product) {
		return (product.getAmmount() * product.getDiscountPercent()) / 100;
	}

	public double calculateTotal(Product product) {
		return product.getAmmount() + calculatetax(product) - calculateDiscount(product);
	}

	public void printInvoice(Product product) {
		InvoicePrinter printer = new InvoicePrinter();
		printer.printInvoice(product);
	}

}
