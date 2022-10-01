package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Where are you from?");
String country=input.nextLine();
String favoriteFood;
switch (country) {
case "United States":
	favoriteFood="Burgers and fries";
	break;
case "Kazakhstan":
	favoriteFood="Beshparmak";
case "Turkey":
	favoriteFood="Adana Kebab";
case "Venezuela":
	favoriteFood="Arepa";
	break;
case "India":
	favoriteFood="Chicken Curry";
	break;
case "France":
	favoriteFood="Croissant";
	break;
case "Yemen":
	favoriteFood="Mandi";
	break;
case "Afghanistan":
	favoriteFood="Qaboli Palow";
	break;
	default:
		favoriteFood="Unknown";
		break;
			
	
	
}
System.out.println("You are from "+country+" and your favorite food is "+favoriteFood);


	}

}
