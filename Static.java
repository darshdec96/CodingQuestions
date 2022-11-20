package com;

class Sample{
	static int a=10;
	public void test() {
		System.out.println("Hello");
	}
}

public class Static extends Sample{
	public void show() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		System.out.println(Sample.a);
		Static s=new Static();
		s.test();
		s.show();
	}
}
