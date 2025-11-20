package com.oops;

public class SelectionSort {
	public static void main(String[] args) {
		int[] b= {2,5,1,3,4};
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if (b[i]>b[j]) {
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array: ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
