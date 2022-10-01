package com.review.clas;

import java.util.Scanner;

public class WhileForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("enter the number");
int i=scanner.nextInt();

while(i!=10) {
	System.out.println(i);i=scanner.nextInt();
}
	}

}
