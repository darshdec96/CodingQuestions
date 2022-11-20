package com;

public class Count_No_of_Digits {

	public static void main(String[] args) {
		int num=420;
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("No of Digits : "+count);

	}

}
