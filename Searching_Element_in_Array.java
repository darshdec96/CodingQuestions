package com;

public class Searching_Element_in_Array {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int search=70;
		
		
		boolean flag=false;
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
			
			if(search==a[i]) {
				System.out.println("Element found : "+i);
				flag=true;
				break;
			}
		}
		
		if(flag==false) {
		System.out.println("Element not found : " +search);
		
		}
	}
}
