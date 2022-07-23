package com.aurionpro.model;

import java.util.HashSet;
import java.util.Set;

public class LineItemSetTest {
	public static void main(String[] args) {
		Set<LineItem> items = new HashSet<>();
		
		

		items.add(new LineItem(101, "Parle-G", 12, 5));
		items.add(new LineItem(102, "maggi", 5, 10));
		items.add(new LineItem(103, "Cadbury", 8, 40));
		items.add(new LineItem(104, "Silk", 2, 70));
		items.add(new LineItem(105, "Good-Day", 2, 20));
		items.add(new LineItem(105, "Good-Day", 2, 20));
		items.add(new LineItem(101, "Parle-G", 10, 5));
		items.add(new LineItem(102, "maggi", 5, 10));
		items.add(new LineItem(103, "Cadbury", 8, 40));
		items.add(new LineItem(104, "Silk", 2, 70));
		items.add(new LineItem(105, "Good-Day", 2, 20));
		items.add(new LineItem(105, "Good-Day", 2, 20));
		
		System.out.println();

		int totalBillAmmount = 0;
		for (LineItem lineItem : items) {
			System.out.println("\nitem Id " + lineItem.getId());
			System.out.println("item Name " + lineItem.getName());
			System.out.println("Item Qty " + lineItem.getQuantity());
			System.out.println("Item price " + lineItem.getUnitPrice());
			System.out.println("Item totalCost " + lineItem.getTotalCost());
			System.out.println("-------------------------");
			totalBillAmmount += lineItem.getTotalCost();
		}

		System.out.println("\nYour Total Bill Amt is : " + totalBillAmmount);

	}
}
