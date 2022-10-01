package com.syntax.class10;

public class GroupTask {

	public static void main(String[] args) {
		// Write a java program to find the second largest
		//number in the array?
		int[]n= {3,5,6,9,56,32,4};
		int largest=n[0];
		int secondLargest=n[0];
		
		for(int i=0; i<n.length;i++) {
			if(n[i]>largest) {
				secondLargest=largest;
				largest=n[i];
			}else if(n[i]>secondLargest) {
				secondLargest=n[i];
			}
			
		}
		System.out.println(secondLargest);

	}

}
