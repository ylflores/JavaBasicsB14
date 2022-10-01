package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner (System.in);
int secret=12345;
int guess;
do {
	System.out.println("Please guess the secret number");
	guess=input.nextInt();
}while(guess!=secret);
System.out.println("You won!");

	}

}
