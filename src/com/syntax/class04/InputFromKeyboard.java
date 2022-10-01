package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please neter your name");
		String name=input.next();
		System.out.println("Hello "+name+" just dont");
	}

}
