package com.aurionpro.test;

import com.aurionpro.model.CustomerRepository;
import com.aurionpro.model.IRepository;
import com.aurionpro.model.OrderRepository;
import com.aurionpro.model.ProductReposiory;

public class InterfaceTest {
	public static void main(String[] args) {
		IRepository customer = new CustomerRepository();
		crudRepository(customer);
		
		IRepository orde = new OrderRepository();
		crudRepository(orde);
		
		IRepository product = new ProductReposiory();
		crudRepository(product);

	}

	private static void crudRepository(IRepository repository) {// Runtime polymorphism
		repository.create();
		repository.read();
		repository.update();
		repository.delete();
		System.out.println("--------------------------");
	}
}
