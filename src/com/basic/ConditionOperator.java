package com.basic;

public class ConditionOperator {
	public static void main(String[] args) {
		int a=10;
		if(a <= 10) {
			System.out.println("A is smaller");
		}
		int x=45, y = 56;
		if(x>y) {
			System.out.println("X is greater");
		}
		else {
			System.out.println("Y is greater");
		}
		System.out.println("Sum is : " +(float)y/x);
		
		int num=5;
		if(num%2 == 0) {
			System.out.println(num+ " is even number");
		}
		else {
			System.out.println(num+ " is odd number");
		}
		
		int p=30, q=60, r=300;
		if(p>q && p>r) {
			System.out.println("P is greater");
		}
		else if(q>p && q>r){
			System.out.println("Q is greater");
		}
		else {
			System.out.println("R is greater OK");
		}
	}

}
