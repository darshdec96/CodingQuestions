package com;

import java.util.Arrays;

public class Bubble_Sort_Bef_Aft {

	public static void main(String[] args) {
		int a[]= {4,2,1,5,3,8,10,12,18,19,25};
		System.out.println("Array before Sort : "+Arrays.toString(a));
		
		int n=a.length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array after Sort : "+Arrays.toString(a));

	}

}
