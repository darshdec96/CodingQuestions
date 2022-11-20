package com;

import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		System.out.println("Input : ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input<=1) {
			System.out.println("Invalid");
		}
		else {
			int flag=0;
			for(int i=2; i<input; i++) {
				if(input%i==0) {
					System.out.println(input+" is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(input+" is prime");
			}
		}
	}
}