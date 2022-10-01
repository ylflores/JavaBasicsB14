package com.syntax.class08;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOdd=0;
		int sumEven=0;
		for( int i=0; i<=50; i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
	System.out.println("Sum of Odd Numbers "+sumOdd);
	System.out.println("Sum of Even Numbers "+sumEven);
	}
}
