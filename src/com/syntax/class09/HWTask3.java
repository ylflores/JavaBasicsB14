package com.syntax.class09;

public class HWTask3 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array
		int[] numbers= {1,2,3,4,5,6,7};
		int sum=0;
		for( int i:numbers){
			sum+=i;
		}
		System.out.println(sum);
	}

}
