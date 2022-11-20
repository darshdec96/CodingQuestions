package com;

public class Exceptions {

	public static void main(String[] args) {
		try {
		int a[]=null;
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=10;
		
		
		
		
//			int a[]=new int[6];
//			int a[]=null;
//			int i=7;
//			int j=0;
//			int k=i/j;
			System.out.println();
		}
		
		catch (ArithmeticException e) {
			System.out.println("Err");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Mistake");
		}
		
		catch (Exception e) {
			System.out.println("Something wrong..");
		}
		
		finally {
			System.out.println("Thanks");
		}
		

	}

}
