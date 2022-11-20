package com;

import java.util.Scanner;

public class Factors_of_Number {
	public static void FindFactors(int input) {
		System.out.println("Factors of "+input + " are : ");
		System.out.println("No. which is divisible");
		for(int i=1; i<=input; i++) {
			if(input%i==0) {
				System.out.println(i+ " ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("Input : ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input<0) {
			System.out.println("Invalid");
		}
		else {
			FindFactors(input);
		}

	}

}
