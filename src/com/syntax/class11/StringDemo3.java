package com.syntax.class11;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=" I love java ";
		System.out.println(str);
		
		
		System.out.println(str.trim());
		String str2="Java is Very easy";
		System.out.println(str2.startsWith("java"));
		System.out.println(str2.endsWith("y"));
		System.out.println(str2.contains("very"));
		System.out.println(str2.toLowerCase().contains("very"));
		

	}

}
