package com.aurionpro.model;

public class InvoicePrinter {

	public void printDetails(Invoice invoice) {

		System.out.println("-------------- PRODUCT INVOICE ---------------\n");

		for (int i = 0; i < invoice.getProducts().size(); i++) {

			System.out.println("Product id : " + invoice.getProducts().get(i).getId());
			System.out.println("Product ammount : " + invoice.getProducts().get(i).getAmount());
			System.out.println("Product Description : " + invoice.getProducts().get(i).getDescription());
			System.out.println("Product Discount : " + invoice.getAlldiscount().get(i));
			System.out.println("Product Tax : " + invoice.getAlltaxes().get(i));
			System.out.println("Product Cost :" + invoice.getAlltotalPrice().get(i));
			System.out.println("\n______________________________________________\n");

		}

		System.out.println("Total Cost of Items : " + invoice.getTotalcost());
		System.out.println("\n______________________________________________\n");

	}

}