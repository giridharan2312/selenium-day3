package com.collec;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HelloWorld {

	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<Integer> ();
		s.add(12);
		s.add(30);
		s.add(98);
		s.add(76);
		
		System.out.println(s.size());
		s.remove(76);
		System.out.println(s);
		
		for (Integer r : s) {
			System.out.println(r);
		}
	}
}
