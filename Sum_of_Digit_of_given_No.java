package com;

import java.util.Scanner;

public class Sum_of_Digit_of_given_No {

	public static void main(String[] args) {
		System.out.println("Input : ");
		Scanner sc=new Scanner(System.in);
		int inputNumber=sc.nextInt();
		System.out.println("Sum of "+inputNumber+" is "+SumOfDigits(inputNumber));
	}
	public static int SumOfDigits(int inputNumber) {
		int sum=0, remainder=0;
		while(inputNumber!=0) {
			remainder=inputNumber%10;
			sum=sum+remainder;
			inputNumber=inputNumber/10;
		}
		return sum;
	}

}
