package com.constructor;

/*
 * Inheritance: Deriving attribute of some other classes.
 * Types: Single, Multilevel, Hierarchical
 */

class Employee{
	int id;
	String name;
	public void setData() {
		id=25;
		name="RuchitRK";
	}
}

class Incentives extends Employee{
	double overtime=6787;
	public void show() {
		System.out.println("ID is: " +id);
		System.out.println("Name is: " +name);
		System.out.println("Overtime is: " +overtime);
	}
}

public class IneritanceDemo {
	public static void main(String[] args) {
		Incentives in=new Incentives();
		in.setData();
		in.show();
	}
}
