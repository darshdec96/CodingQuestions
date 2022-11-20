package com;

import java.util.Scanner;

public class Sum_of_Natural_No {
	public static int SumOfNumbers(int input) {
		int sum=0;
		for(int i=1; i<=input; i++) {
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Formula : S=n(n+1)/2");
		System.out.println("Input : ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input<0) {
			System.out.println("Invalid No.");
		}
		else {
			int result=SumOfNumbers(input);
			System.out.println("Sum of No. upto "+input+" is "+result);
		}
	}
}
