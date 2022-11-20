package com;

import java.util.Scanner;

public class Factors_of_No_within_Range {
	
	public static void FindFactors(int input) {
		System.out.print("Factors of "+input+" are : ");
		for(int i=1; i<=input; i++) {
			if(input%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("Input : ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input<0) {
			System.out.print("Invalid");
		}
		else {
			for(int i=1; i<=input; i++) {
				FindFactors(i);
			}
		}
	}
}