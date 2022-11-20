package com;

import java.util.Scanner;

public class Fibo_Recursion{
	public static int Fibonacci(int input) {
		if(input==0 || input==1) {
			return input;
		}
		else {
			return Fibonacci(input-1)+Fibonacci(input-2);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Provide terms : ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		for(int i=0; i<=input; i++) {
			int result=Fibonacci(i);
			System.out.print(result+" ");
		}
	}
	
//	static int previous=0, next=1, result;
//	public static void Fibonacci(int input) {
//		if(input>0) {
//			System.out.print(previous+" ");
//			result=previous+next;
//			previous=next;
//			next=result;
//			Fibonacci(input-1);
//		}
//	}
//	public static void main(String[] args) {
//		System.out.print("Input : ");
//		Scanner sc=new Scanner(System.in);
//		int input=sc.nextInt();
//		Fibonacci(input);
//	}
	
}
