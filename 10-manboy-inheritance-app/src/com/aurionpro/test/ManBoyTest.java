package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class ManBoyTest {
	public static void main(String[] args) {
		case1();// reference and object of the same type(Man)
		System.out.println("--------------------------------------");
		case2(); //reference and object of the same type(Boy)
		System.out.println("--------------------------------------");
		case3();//// reference of Parent class and object of the child class (RUNT Poly-morphism)
		System.out.println("--------------------------------------");
		case4(); // Reference of child class and obj of parent class (Error)
		
		case5();
		System.out.println("--------------------------------------");
		case5();
		System.out.println("--------------------------------------");
		case6();
		System.out.println("--------------------------------------");
	}

	private static void case6() {
		Object obj ;
		obj= 10;
		System.out.println(obj.getClass());
		obj="Ritesh Ghule";
		System.out.println(obj.getClass());
		obj= 12.5;
		System.out.println(obj.getClass());
		obj=true;
		System.out.println(obj.getClass());
	}

	private static void case1() {
		Man man = new Man();// reference and object of the same type(Man)
		man.play();
		man.read();
	}

	private static void case2() {
		Boy boy = new Boy();// reference and object of the same type(Boy)
		boy.play();
		boy.read();
	}

	private static void case3() {
		Man man = new Boy();// reference of Parent class and object of the child class (RUNTIME
							// Polu-morphysm)
		man.play();
		man.read();
	}

	private static void case4() {
//		Infant infant = Man();
//		infant.play();
//		infant.read();

	}

	private static void case5() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}

	private static void atThePark(Man man) {
		man.play();
		man.read();
	}

}
