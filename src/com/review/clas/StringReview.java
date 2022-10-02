package com.review.clas;

import java.util.Arrays;

public class StringReview {

	public static void main(String[] args) {
		String str="hello";
		str=str.toUpperCase();
		System.out.println(str);
		
		String myStr="Today is a review class";
		String [] arr=myStr.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[3]);
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
for(String ar:arr) {
	System.out.println(ar);
	
}
	}

}
