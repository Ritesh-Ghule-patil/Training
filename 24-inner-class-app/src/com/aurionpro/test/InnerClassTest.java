package com.aurionpro.test;

import com.aurionpro.model.OuterClass;
import com.aurionpro.model.OuterClass.InnerClass;
import com.aurionpro.model.OuterClass.StaticInnerclass;

public class InnerClassTest {
	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		outer.setA(10);
		System.out.println(outer.getA());
		
		InnerClass inner = outer.new InnerClass();
		inner.setB(20);
		System.out.println(inner.getB());
		
		StaticInnerclass  staticInner = new OuterClass.StaticInnerclass();
		staticInner.c=30;
		System.out.println(staticInner.c);
	}
}
