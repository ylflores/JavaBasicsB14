package com.syntax.class11;

public class StringDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I love java programming";
		char[] charArray=str.toCharArray();
		
		System.out.println(charArray[1]);
		int counter=0;
		for(char c:charArray) {
			if(c=='a') {
				counter++;
			}
			
		}
		System.out.println(counter);
	}

}
