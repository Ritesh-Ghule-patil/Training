package com.aurionpro.model;


public class Person {
	private final String name;
	private final int age;
	private final float height;
	private final float weight;
	private final GenderOption gender;

	public Person(String name, int age, float height, float weight, GenderOption gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public GenderOption getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", gender="
				+ gender + "]";
	}

}
