package com.syntax.class06;

public class LargestNumber {

	public static void main(String[] args) {
int b1=100;
int b2=100;
int b3=100;
int largest=0;
if(b1>b2 && b1>b3) {
	largest=b1;
}else if(b2>b1 && b2>b3) {
	largest=b2;
}else if(b3>b1 && b3>b2) {
	largest=b3;
} 


if(largest!=0) {
if(largest%2==0) {
	System.out.println(largest+" is even munber");
} else {
	System.out.println(largest+" is an odd number");
}
	}

}
}