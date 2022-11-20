package com;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		System.out.println("Enter String : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String original_number=str;
		
		String rev="";
		int length=str.length();
		
		for(int i=length-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
