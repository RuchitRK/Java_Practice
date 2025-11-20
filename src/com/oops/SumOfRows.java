package com.oops;

public class SumOfRows {
	public static void main(String[] args) {
		int[][] a= {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
		for (int i = 0; i < a.length; i++) {
			int sum=0;
			for (int j = 0; j < a[i].length; j++) {
				sum+=a[i][j];
			}
			System.out.println("Sum of " +(i+1)+ "- row is: " +sum);
		}
		//below is sum of columns
//		for (int j = 0; j < a[0].length; j++) {
//			int sum=0;
//			for (int i = 0; i < a.length; i++) {
//				sum+=a[i][j];
//			}
//			System.out.println("Sum of " +(j+1)+ " column is: " +sum);
//		}
	}

}
