package com.aurionpro.model;

public class Countries {

	private String code;
	private String name;
	private int id;

	public Countries(String code, String name, int id) {
		super();
		this.code = code;
		this.name = name;
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Countries [code=" + code + ", name=" + name + ", id=" + id + "]";
	}

}
