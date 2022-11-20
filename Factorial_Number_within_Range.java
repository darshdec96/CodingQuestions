package com;

import java.util.Scanner;

public class Fact_Num_within_Range {
	public static void Factorial(int input) {
		int fact=1;
		for(int i=1; i<=input; i++) {
			if(i==0) {
				fact=fact*1;
				
			}
			else {
				fact=fact*i;
			}
		}
		System.out.println(input+"!="+fact);
	}

	public static void main(String[] args) {
		System.out.print("Input : ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input<0) {
			System.out.println("Invalid Number");
		}
		else {
			for(int i=0; i<=input; i++) {
				Factorial(i);
			}
		}

	}

}
