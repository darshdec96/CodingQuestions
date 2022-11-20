package com;

import java.util.Scanner;

public class Count_Even_and_Odd_Array {

	public static void main(String[] args) {
		System.out.print("Array Size : ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.print("Enter the "+size+" Elements : ");
		
		int[] arr=new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		FindEvenOdd(arr);
	}
	public static void FindEvenOdd(int[] arr) {
		int evencount=0, oddcount=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" is even");
				evencount++;
			}
			else {
				System.out.println(arr[i]+" is odd");
				oddcount++;
			}
		}
		System.out.println("Even= "+evencount);
		System.out.println("Odd= "+oddcount);
	}
}
