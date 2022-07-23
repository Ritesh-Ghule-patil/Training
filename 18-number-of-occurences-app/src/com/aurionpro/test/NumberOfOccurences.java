package com.aurionpro.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NumberOfOccurences {
	public static void main(String[] args) {

		List<Integer> number = new ArrayList<>(List.of(20, 30, 40, 60,
				30, 20, 40, 40, 30, 60, 20));

		Map<Integer, Integer> occurences = new HashMap<>();

		for (Integer e : number) {
			
			Integer key = e;
			if (occurences.containsKey(key)) {
				int count = occurences.get(key);
				count++;
				occurences.put(key, count);
			} else
				occurences.put(key, 1);
		}

		//System.out.println(occurences);
		
		Iterator<Map.Entry<Integer,Integer>> it = occurences.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Integer, Integer> entry = it.next();
			System.out.println("Number "+entry.getKey()+ " is Occured at "+ entry.getValue()+ " Time");
		}
		
	}
}
