package com;

import java.util.Scanner;

public class Armstrong_No_3_Digit {	
	public static void main(String[] args) {
		System.out.print("Input : ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int temp=input;
		int result=0;
		while(temp!=0) {
			int remainder=temp%10;
			result +=remainder*remainder*remainder;
			temp=temp/10;
		}
		if(input==result) {
			System.out.println(input+" is ArmStrong No.");
		}
		else {
			System.out.println(input+" is not ArmStrong No.");
		}

	}

}
