package com;

public class Reverse_String {

	public static void main(String[] args) {
		String str="ABCD EFGH";
		String rev="";
		int length=str.length();
		
		for(int i=length-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse is : "+rev);

	}

}
