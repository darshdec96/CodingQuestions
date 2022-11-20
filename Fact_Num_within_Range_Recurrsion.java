package com;

import java.util.Scanner;

public class Fact_Num_within_Range_Recurrsion {
	public static int Factorial(int input) {
		if(input==0||input==1) {
			return 1;
		}
		else {
			return input*Factorial(input-1);
		}
	}

	public static void main(String[] args) {
		System.out.print("Input : ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input<0) {
			System.out.println("Invalid No.");
		}
		else {
			for(int i=0; i<=input; i++) {
				int result=Factorial(i);
				System.out.println(i+"!="+result);
			}
		}
	}
}
