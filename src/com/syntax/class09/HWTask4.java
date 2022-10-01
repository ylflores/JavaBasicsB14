package com.syntax.class09;

public class HWTask4 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.}
		int [] element= {2,4,6,8};{
		int max=element[0];
		for(int i=0; i<element.length; i++) {
			if(element[i]>max) {
				max=element[i];
			}
		}System.out.println(max);

	}

	
	}

}
