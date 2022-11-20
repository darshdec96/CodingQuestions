package com;

class Parent{
	public void show() {
		for(int i=1; i<=5; i++) {
			System.out.println("Parent");
			try {
				Thread.sleep(2500);
			}
			catch(Exception e) {}
		}
	}
}

class Child{
	public void how() {
		for(int i=1; i<=5; i++) {
			System.out.println("Child");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}
	}
}

public class Th_tail {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.show();
		
		Child c=new Child();
		c.how();		
		}
	}
