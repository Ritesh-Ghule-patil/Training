package com.aurionpro.model;

public class InvoicePrinter {
	
	Invoice in = new Invoice();

	public void printInvoice(Product product) {
		System.out.println("id : "+ product.getId());
		System.out.println("Ammount : " + product.getAmmount());
		System.out.println("Description : "+ product.getDescription());
		System.out.println("Tax : "+ in.calculatetax(product));
		System.out.println("Discount : "+ in.calculateDiscount(product));
		System.out.println("Total : "+ in.calculateTotal(product) );
	}
}
