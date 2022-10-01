package com.syntax.class04;

import java.util.Scanner;

public class InpoutFtomTheKeyboard {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter your age");
int age=scanner.nextInt();
if(age<18) {
	System.out.println("You should study");
}else {
	System.out.println("You should start working");
}
	}

}
