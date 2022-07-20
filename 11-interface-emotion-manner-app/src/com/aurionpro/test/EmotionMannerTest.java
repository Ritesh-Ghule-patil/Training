package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotionable;
import com.aurionpro.model.IMannerable;
import com.aurionpro.model.Man;

public class EmotionMannerTest {
	public static void main(String[] args) {
		
		Boy boy = new Boy();

		Man man = new Man();
		
		manner(boy);
		manner(man);
		emotion(man);
		
	}

	private static void manner(IMannerable person) {
		person.depart();
		person.greet();
		System.out.println("------------------------------");
		
	}
	private static void emotion(IEmotionable person) {
		person.cry();
		person.laugh();
		System.out.println("------------------------------");
		
	}
}
