package com.syntax.class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName;
		String password;
		String confirmPassword;	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the userName");
		userName=scanner.next();
		System.out.println("Please enter the password");
		password=scanner.next();
		System.out.println("Plese enter password again");
		confirmPassword=scanner.next();
		

if(userName.isEmpty() || password.isEmpty()) {
	System.out.println("Username and password cannot be empty");
}else if(password.length()<8) {
	System.out.println("Password is too short");
}else if(password.contains(userName)) {
	System.out.println("Password cannot contain username");
}else if(!password.equals(confirmPassword)) {
	System.out.println("Passwords do not match");
}else {
	System.out.println("Your username and password has been created");
}

	}

}
