package com.syntax.class08;

import java.util.Scanner;

public class TaskKey2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Please enter the item");
String item=input.nextLine();
System.out.println("Please enter the price");
double price=input.nextDouble();
double money;
double total = 0;
do {
	System.out.println("How much money do you have?");
	money=input.nextDouble();
	total+=money;
	double need;
	double change;
	if(total<price) {
		need=price-total;
		System.out.println("You need to pay more $ "+need);
	}else if(total>price) {
		change=(total-price);
		System.out.println("Here's your change");
		break;
	}
	
	
}while(total!=price);
System.out.println("Thank you for shopping");

	}

}
