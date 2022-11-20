package com;

import java.util.Scanner;

public class Pattern_Number11 {

	public static void main(String[] args) {
		System.out.println("Input : ");
		Scanner sc=new Scanner(System.in);
		int noOfRow=sc.nextInt();
		for(int row=1; row<=noOfRow; row++) {
			for(int column=noOfRow; column>=row; column--) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
				

	}

}
