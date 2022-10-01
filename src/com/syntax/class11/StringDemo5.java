package com.syntax.class11;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I love java programming";
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==' ') {
				continue;
			}else {
			System.out.println(str.charAt(i));
			}
		}
	}

}
