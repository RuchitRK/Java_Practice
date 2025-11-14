package com.oops;

class Student{
	
	int id;
	String name;
	
	public void setData() {
		id=25;
		name="Ruchit";
	}
	public void show() {
		System.out.println("ID is: "+id);
		System.out.println("Name is: "+name);
	}
}

public class ClassAndObject {
	public static void main(String[] args) {
		Student s1= new Student();
		s1.setData();
		s1.show();
	}
}
