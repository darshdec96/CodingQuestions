package com;

import java.util.Scanner;

public class Pattern_Number10 {

	public static void main(String[] args) {
		System.out.println("Input : ");
		Scanner sc=new Scanner(System.in);
		int noOfRows=sc.nextInt();
		for(int row=1; row<=noOfRows; row++) {
			for(int column=noOfRows; column>=row; column--) {
				System.out.print(column+" ");
			}
			System.out.println();
		}
				

	}

}
