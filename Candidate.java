package com;

public class Candidate implements HR{
	public void hiring() {
		System.out.println("Meeting with Manager");
	}	
	public void bonus() {
		System.out.println("Speak with Hr");
	}
	
	void joing_formalities() {
		System.out.println("Interested to join");
	}

	public static void main(String[] args) {
		Candidate b=new Candidate();
		b.hiring();
		b.bonus();
		b.joing_formalities();
		}
	}
