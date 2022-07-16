package com.aurionpro.mode;

public class Player {
	
	private  String id="";
	private final String name;
	private final int age;

	private static int idCount=101;

	public Player(int id, String name, int age) {
		this.id = "P" +id;
		this.name = name;
		this.age = age;
	}
	
	public Player(String name, int age) {
		this.id = "P"+ (idCount++);
		this.name = name;
		this.age= age;
	}
	

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	public boolean IsElder( Player p2) {
		
		if(this.age>p2.age) {
			return true;
		}
		return false;
	}
	
	

	public static Player whoIsElder(Player p1, Player p2) {
		
		if(p1.age > p2.age) {
			return p1;
		}
		return p2;
	}
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
