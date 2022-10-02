package com.review.clas;

public class PossibleQuestions {

	public static void main(String[] args) {
		// how would you reverse a string?
		
		String str="hello";
		String newString="";
		for(int i=str.length()-1; i>=0;i--) {
			newString=newString+str.charAt(i);		
			}
		System.out.println(newString);
		
		String s="Class is almost over";
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
		

	}

}
