package com;

import java.util.Arrays;

public class Check_equality_of_2_Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4};
		
		boolean status=Arrays.equals(a,b);
		
		if(status==true) {
			System.out.println("Arrays are true");
		}
		else {
			System.out.println("Arrays are false");
		}
		
	}

}
