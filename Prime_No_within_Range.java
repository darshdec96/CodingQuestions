package com;

import java.util.Scanner;

public class Prime_No_within_Range {

	public static void main(String[] args) {
		System.out.println("Input : ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input<=1) {
			System.out.println("Invalid");
		}
		else {
			for(int num=2; num<=input; num++) {
				int flag=0;
				for(int i=2; i<=num/2; i++) {
					if(num%i==0) {
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.print(num+" ");
				}
			}
		}

	}

}
