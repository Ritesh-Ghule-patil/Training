package com.aurionpro.model;

public class Invoice {
	private String id ;
	private String description;
	private double ammount;
	private float tax;
	private double discountPercent;
	
	
	public Invoice(String id, String description, double ammount, float tax, double discountPercent) {
		super();
		this.id = id;
		this.description = description;
		this.ammount = ammount;
		this.tax = tax;
		this.setDiscountPercent(discountPercent);
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
	
	public double calculatetax() {
		return (ammount*tax)/100;
	}
	
	public double calculateDiscount() {
		return (ammount*discountPercent)/100;
	}
	
	public double calculateTotal() {
		return ammount+discountPercent-tax;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", description=" + description + ", ammount=" + ammount + ", tax=" + tax
				+ ", discountPercent=" + discountPercent + "]";
	}
	
	
	
}
