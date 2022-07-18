package com.aurionpro.model;

public class OrderRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("creating Order");
	}

	@Override
	public void read() {
		System.out.println("reading Order");
	}

	@Override
	public void update() {
		System.out.println("creating Order");
	}

	@Override
	public void delete() {
		System.out.println("deleting Order");
	}

}
