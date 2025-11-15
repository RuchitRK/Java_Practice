package com.basic;

public class Pattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============================");
		for (int k = 1; k <= 5; k++) {
			for (int l = 1; l <= k; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		System.out.println("============================");
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print(y%2);
			}
			System.out.println();
		}
		System.out.println("============================");
		for (int a = 1; a <= 5; a++) {
			for (int b = 6-a; b >= 1; b--) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
