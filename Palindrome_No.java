package com;

import java.util.Scanner;

public class Palindrome_No {

	public static void main(String[] args) {
		System.out.println("Enter No : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int original_number=num;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);

	}

}
