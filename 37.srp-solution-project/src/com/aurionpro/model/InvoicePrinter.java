package com.aurionpro.model;

public class InvoicePrinter {
	
	public void printInvoice(Invoice invoice) {
		System.out.println("id : "+invoice.getId());
		System.out.println("Ammount : "+invoice.getAmmount());
		System.out.println("Description : " +invoice.getDescription());
		System.out.println("Tax : "+invoice.calculatetax());
		System.out.println("Discount : "+invoice.calculateDiscount());
		System.out.println("Total : "+ invoice.calculateTotal());
	}
}
