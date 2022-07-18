package com.aurionpro.model;

public class CustomerRepository implements IRepository {

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("creating Customer");

	}

	@Override
	public void read() {
		System.out.println("reading Customer");
	}

	@Override
	public void update() {
		System.out.println("updating Customer");
	}

	@Override
	public void delete() {
		System.out.println("deleting Customer");
	}

}
