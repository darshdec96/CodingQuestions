package com;

import java.util.Scanner;

public class Pattern_Number9 {

	public static void main(String[] args) {
		System.out.println("Input : ");
		Scanner sc=new Scanner(System.in);
		int noOfRow=sc.nextInt();
		for(int row=noOfRow; row>=1; row--) {
			for(int column=row; column>=1; column--) {
				System.out.print(row+" ");
			}
			System.out.println();
		}

	}

}
