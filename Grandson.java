package com;

public class Grandson implements Father, Son{
	public void bike() {
		System.err.println("Bike is inherited");
	}

	public void car() {
		System.err.println("Car is inherited");
	}
	
	public void cycle() {
		System.out.println("Cycle is mine");
	}
	
	public static void main(String[] args) {
		Grandson g=new Grandson();
		g.bike();
		g.car();

	}

}
