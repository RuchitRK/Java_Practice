package com.constructor;

/*
 * Polymorphism
 * functions overriding: same function name, return type and body maybe different
 * Keywords==> Super: calls the function of immediate parent
 */

class A{
	public A() {
		System.out.println("This is construtor A");
	}
	public void show() {
		System.out.println("In A show");
	}
}
class B extends A{
	public B() {
		System.out.println("This is construtor B");
	}
	public void show() {
		super.show();
		System.out.println("In B show");
	}
}
class C extends B{
	public C() {
		System.out.println("This is construtor C");
	}
	public void show() {
		super.show();
		System.out.println("In C show");
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		C c=new C();
		c.show();
	}

}
