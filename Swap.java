package com;

public class Swap {
	public static void SwapNumbers(int a, int b, int c, int d) {
		System.out.println("Before Swap a="+a +" b="+b +" c="+c +" d="+d);
		a=a+b+c+d;
		b=a-(b+c+d);
		c=a-(b+c+d);
		d=a-(b+c+d);
		a=a-(b+c+d);
		
		
		System.out.println("After Swap a="+a +" b="+b +" c="+c +" d="+d);
	}

	public static void main(String[] args) {
		int a=5, b=7, c=9, d=3;
		SwapNumbers(a,b,c,d);
	}
}
