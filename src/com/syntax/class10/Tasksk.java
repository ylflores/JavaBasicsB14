package com.syntax.class10;

import java.util.Scanner;

public class Tasksk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner (System.in);

        int[] number= new int[5];

        int sum=0;

        for (int i=0; i<5; i++) {
            System.out.println("Please enter a value");
            number[i]=num.nextInt();


            sum=sum+number[i];
        }
    System.out.println(sum);


    }
    
	}


