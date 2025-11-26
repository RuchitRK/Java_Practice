package com.oops;

public class Merge2SortedArray {
	public static void main(String[] args) {
		int[] even= {2,4,12,14,22};
		int[] odd= {5,7,13,15};
		int[] A=new int[30];
		int e=0;
		int o=0;
		int l=0;
		int n1=even.length;
		int n2=odd.length;
		while (e<n1 && o<n2) {
			if (even[e]<odd[o]) {
				A[l]=even[e];
				e+=1;
			}else {
				A[l]=odd[o];
				o+=1;
			}
			l+=1;
		}
		while (e<n1) {
			A[l]=even[e];
			e+=1;
			l+=1;
		}
		while (o<n2) {
			A[l]=odd[o];
			o+=1;
			l+=1;
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i]!=0) {
				System.out.println(A[i]);
			}
		}
	}
}
