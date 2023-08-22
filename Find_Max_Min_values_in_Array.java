package com;

public class Find_Max_Min_values_in_Array {

	public static void main(String[] args) {
		int a[]= {50,100,40,20,60};
		int max=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Max Elements in Array : "+max);
		
		int min=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Min Elements in Array : "+min);

	}

}
