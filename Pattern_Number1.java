package com;

import java.util.Scanner;

public class Pattern_Number1 {

	public static void main(String[] args) {
		System.out.print("Input : ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		for(int row=1; row<=input; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}

	}

}
