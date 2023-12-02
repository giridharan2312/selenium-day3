package org.test;

public class Hello {
	public static void main(String[] args) {
		String s="java";
		String s1="SELENium";
		
		//int len = s.length();
		//System.out.println(len);
		
		int len = s.length();  //ctrl;+2+L
		System.out.println(len);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s1.toLowerCase();
		System.out.println(lowerCase);
		
		int indexOf = s.indexOf('a');
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf('a');
		System.out.println(lastIndexOf);
		
		char charAt = s.charAt(2);
		System.out.println(charAt);
		
		boolean equals = s.equals("JAVA");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s);
		System.out.println(equalsIgnoreCase);
	}
}
