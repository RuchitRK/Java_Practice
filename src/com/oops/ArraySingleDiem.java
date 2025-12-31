package com.oops;

import java.util.Scanner;

public class ArraySingleDiem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= new int[5];
		int[] b= {1,2,3,4,5};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter value: ");
			a[i]=sc.nextInt(); 
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(b[0]);
		sc.close();
	}
}
