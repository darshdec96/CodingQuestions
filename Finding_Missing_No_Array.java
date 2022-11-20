package com;

public class Finding_Missing_No_Array {

	public static void main(String[] args) {
		int a[]= {1,2,4,5};
		
		int sum1=0;
		for(int i=0; i<a.length; i++) {
			sum1=sum1+a[i];
		}
		System.out.println("Sum of Elements in Array : "+sum1);
		
		int sum2=0;
		for(int i=1; i<=5; i++) {
			sum2=sum2+i;
		}
		System.out.println("Sum of range of Elements in Array : "+sum2);
		
		System.out.println("Missing No. : "+(sum2-sum1));		

	}

}
