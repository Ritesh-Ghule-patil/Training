package com.aurionpro.model;

import java.util.Objects;

public class LineItem {
	private int id;
	private String name;
	private int quantity;
	private double unitPrice;
	private double totalCost;

	LineItem(int id, String name, int quantity, double unitPrice) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalCost = calculateTotalCost(quantity, unitPrice);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public double getTotalCost() {
		return totalCost;
	}
	
	private double calculateTotalCost(int qty, double price){
		return qty*price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineItem other = (LineItem) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	
}
