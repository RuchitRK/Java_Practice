package com.oops;

class Student123{
	int a,b;
	
	public void sum() {
		a=20;
		b=10;
		System.out.println("Sum is: " +(a+b));
	}
	public void sum(int num1, int num2) {
		a=num1;
		b=num2;
		System.out.println("Sum is: " +(a+b));
	}
	public double div() {
		a=10;
		b=2;
		return a/b;
	}
	public double div(int num1, int num2) {
		a=num1;
		b=num2;
		return a/b;
	}
}

public class function {
public static void main(String[] args) {
	Student123 s = new Student123();
	s.sum();
	s.sum(50,40);
	System.out.println("Division is: " + s.div());
	System.out.println("Division is: " + s.div(90, 30));
}
}
