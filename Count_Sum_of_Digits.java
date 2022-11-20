package com;

public class Count_Sum_of_Digits {

	public static void main(String[] args) {
		int num=12354; // 1+2+3+4=10
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Sum of Digits "+sum);

	}

}
