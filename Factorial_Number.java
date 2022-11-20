package com;

import java.util.Scanner;

public class Factorial_Number {
	public static void Factorial(int input) {
		if(input<0) {
			System.out.println("Invalid No.");
		}
		else {
			int fact=1;
			for(int i=input; i>0; i--) {
				fact=fact*i;
			}
			System.out.println("Factorial is "+input+" is "+fact);
		}
	}

	public static void main(String[] args) {
		System.out.println("Input No. ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		Factorial(input);

	}

}
