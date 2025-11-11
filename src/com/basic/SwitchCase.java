package com.basic;

public class SwitchCase {
	public static void main(String[] args) {
		char ch = '+';
		int a=10, b=5;
		switch(ch) {
		case '+':
			System.out.println("Sum of A+B is : " +(a+b));
			break;
		case '-':
			System.out.println("Subtraction of A-B is : "+(a-b));
			break;
		case '*':
			System.out.println("Multiplication of A*B is : "+(a*b));
			break;
		case '/':
			System.out.println("Multiplication of A*B is : "+(a/b));
			break;
		case '%':
			System.out.println("Multiplication of A*B is : "+(a%b));
			break;
		default:
			System.out.println("There is no ch");
			break;
		}
	}

}
