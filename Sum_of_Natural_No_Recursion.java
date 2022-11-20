package com;

import java.util.Scanner;

public class Sum_of_Natural_No_Recursion {
	public static int SumOfNumbers(int input) {
		if(input<=1) {
			return input;
		}
		else {
			return input+SumOfNumbers(input-1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Formula : S=n(n+1)/2");
		System.out.println("Input : ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input<0) {
			System.out.println("Invalid");
		}
		else {
			int result=SumOfNumbers(input);
			System.out.println("No. "+input+" is "+result);
		}
		

	}

}
