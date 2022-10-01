package com.syntax.class09;

public class HWTask2 {

	public static void main(String[] args) {
		// Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
		String[]animals= {"Dodo", "Hamster", "Dog","Pelican","Hedgehog"};
		for(int i=0; i<animals.length;i++) {
			System.out.println(animals[i]);
		}
		System.out.println();
		
		for(String specie:animals) {
			System.out.println(specie);
		}

	}

}
