package com.oops;

import java.util.Scanner;
/*
 * 123
 * 1
 * 12345
 * 12
 */
public class JaggedArray {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int nrow;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		nrow=sc.nextInt();
		int[][] a=new int[nrow][];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Number of columns in a row " +i);
			a[i]=new int[sc.nextInt()];
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=j+1;
			}
		}
		System.out.println("So the output is: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
