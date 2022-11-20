package com;

import java.util.Scanner;

public class Sum_of_Array_Elements {
	public static void main(String[] args) {
		System.out.print("Array Size : ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int result=SumOfElements(arr);
		System.out.println("sum="+result);
	}
	
	public static int SumOfElements(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

}
