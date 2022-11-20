package com;

import java.util.Scanner;

public class Pattern_Number5 {

	public static void main(String[] args) {
		System.out.println("Input : ");
		Scanner sc=new Scanner(System.in);
		int noOfRows=sc.nextInt();
		for(int row=noOfRows; row>=1; row--) {
			for(int column=row; column<=noOfRows; column++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}

	}

}
