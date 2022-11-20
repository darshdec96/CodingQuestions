package com;

import java.util.Scanner;

public class Sum_of_Digit_of_given_No_Recurssion {

	public static void main(String[] args) {
		System.out.println("Input : ");
		Scanner sc=new Scanner(System.in);
		int inputNumber=sc.nextInt();
		System.out.println("Sum of "+inputNumber+" is "+SumofDigits(inputNumber));
	}
	public static int SumofDigits(int inputNumber) {
		if(inputNumber==0) {
			return 0;
		}
		else {
			return (inputNumber%10+SumofDigits(inputNumber/10));
		}
	}

}
