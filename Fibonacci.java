package com;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print("Input : ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int previous=0, next=1, result=0;
		for(int i=0; i<=input; i++) {
			System.out.print(previous+ " ");
			result=previous+next;
			previous=next;
			next=result;
						
		}
		}
	}



