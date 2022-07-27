package com.aurionpro.test;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		
		String str = "Wlcome to learn ,java in new way";
		
		StringTokenizer st = new StringTokenizer(str, ",  ");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		
		String[] arr =  str.split(" ");
		System.out.println(Arrays.toString(arr));
	}
}
