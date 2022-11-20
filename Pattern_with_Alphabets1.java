package com;

import java.util.Scanner;

public class Pattern_with_Alphabets1 {

	public static void main(String[] args) {
		System.out.println("Input : ");
		Scanner sc=new Scanner(System.in);
		int noOfRows=sc.nextInt();
		int counter=0;
		for(int row=1; row<=noOfRows; row++) {
			for(int count=row; count<=noOfRows; count++) {
				System.out.print(('A'+counter)+" ");
				counter++;
			}
			System.out.println();
		}

	}

}
