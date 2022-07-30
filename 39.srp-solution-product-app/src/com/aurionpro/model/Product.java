package com.aurionpro.model;

public class Product {
	private String id;
	private String description;
	private double ammount;
	private float tax;
	private double discountPercent;

	public Product(String id, String description, double ammount, float tax, double discountPercent) {
		this.id = id;
		this.description = description;
		this.ammount = ammount;
		this.tax = tax;
		this.discountPercent = discountPercent;
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getAmmount() {
		return ammount;
	}

	public float getTax() {
		return tax;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	@Override
	public String toString() {
		return "id = " + id + "\ndescription = " + description + "\nammount = " + ammount + "\ntax = " + tax
				+ "\ndiscountPercent = " + discountPercent ;
	}

	
}
