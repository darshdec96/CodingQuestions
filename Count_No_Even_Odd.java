package com;

public class Count_No_Even_Odd {

	public static void main(String[] args) {
		int num=12345;
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("Even no. : "+even_count);
		System.out.println("Odd no. : "+odd_count);

	}

}
