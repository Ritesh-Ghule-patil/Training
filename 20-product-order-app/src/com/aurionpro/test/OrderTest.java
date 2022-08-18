package com.aurionpro.test;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class OrderTest {
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Product samsung = new Product(101, "s-21", 90000, 5.5f);
		Product apple = new Product(201, "iphone-11", 60000, 8f);
		Product oneplus = new Product(301, "nord-2", 25000, 10f);
		
		LineItem item1 = new LineItem(1001, 1, oneplus);
		LineItem item2 = new LineItem(1002, 1, apple);
		LineItem item3 = new LineItem(1003, 1, samsung);
		
		Order order = new Order(1, "10-08-2022");
		order.addLineItem(item1);
		order.addLineItem(item2);
		
		Order order2 = new Order(2, "10-08-2022");
		order2.addLineItem(item3);
		order2.addLineItem(item2);
		order2.addLineItem(item1);
		
		System.out.println(order);
		
		Customer ritesh = new Customer(1, "Ritesh");
		ritesh.addOrder(order);
		
		System.out.println("ritesh order count is : "+ritesh.getOrderCount());
		System.out.println("items counts are : " + order.itemCount());
		System.out.println("order price is : "+ order.calculateOrderPrice());
		
		System.out.println("_________________________________________________________\n");
		
		
		Customer sandesh = new Customer(2, "sandesh");
		sandesh.addOrder(order2);
		
		System.out.println("sandesh order count is : "+sandesh.getOrderCount());
		System.out.println("items counts are : " + order2.itemCount());
		System.out.println("order price is : "+ order2.calculateOrderPrice());
		
		
	}
}
