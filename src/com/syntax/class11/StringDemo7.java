package com.syntax.class11;

public class StringDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am always confused";
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf(" "));
		
		System.out.println(str.substring(2,10));
		System.out.println(str.substring(5));
		
		int num=1223455;
		String numStr=String.valueOf(num).substring(1,3);
		System.out.println(numStr);
		num=Integer.parseInt(numStr);
		System.out.println(num);
		
		
		

	}

}
