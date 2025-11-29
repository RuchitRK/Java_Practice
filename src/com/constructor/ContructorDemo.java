package com.constructor;

/*
 * Constructor: Special member function
 * 1. Same name as ClassName
 * 2. No return type
 * Automatically involved whenever an object is created.
 */

class Box{
	double length, height, width;
	public Box() {
		System.out.println("This is default constructor");
		length=1;
		height=2;
		width=3;
	}
	public Box(double l, double h, double w) {
		System.out.println("This is the parameter constructor: ");
		length=l;
		height=h;
		width=w;
	}
	public void VolumeOfBox() {
		System.out.println("Voulume of Box is: " +(length*height*width));
	}
}

public class ContructorDemo {
	public static void main(String[] args) {
		Box dc=new Box();
		dc.VolumeOfBox();
		Box pc= new Box(10,20,30);
		pc.VolumeOfBox();
	}
}
