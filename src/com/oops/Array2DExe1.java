package com.oops;

public class Array2DExe1 {
	public static void main(String[] args) {
		int[][] a= {{1,2,3,4},{5,6,7,0},{9,2,0,4}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j]==0) {
					for (int c = 0; c < a[i].length; c++) {
						if (a[i][c]!= 0) {
							a[i][c]= -1;
						}
					}
					for (int r = 0; r < a.length; r++) {
						if (a[r][j]!= 0) {
							a[r][j]= -1; 
						}
					}
				}
			}
				
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j]==-1) {
					a[i][j]=0;
				}
			}
		}	
		for (int i = 0; i < a.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("]");
        }
	}

}
