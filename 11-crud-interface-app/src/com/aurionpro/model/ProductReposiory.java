package com.aurionpro.model;

public class ProductReposiory implements IRepository {

	@Override
	public void create() {
		System.out.println("creating Product");
	}

	@Override
	public  void read() {
		System.out.println("reading Product");
	}

	@Override
	public void update() {
		System.out.println("updating Product");
	}

	@Override
	public void delete() {
		System.out.println("deleting Product");
	}

}
