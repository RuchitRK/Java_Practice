package com.constructor;

/*
 * single and multiple child
 */

class Parent{
	String p_name;
	long ph_no;
	public void setParent() {
		p_name="RageSparky";
		ph_no=1234567890;
	}
}
class child1 extends Parent{
	String child_name="Royal";
	public void show() {
		System.out.println("For any complain of "+child_name + " " + p_name + " call on " + ph_no);
	}
}
class child2 extends Parent{
	String child_name="Giant";
	public void show() {
		System.out.println("For any complain of "+child_name + " " + p_name + " call on " + ph_no);
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		child1 c1=new child1();
		child2 c2=new child2();
		c1.setParent();
		c1.show();
		c2.setParent();
		c2.show();
	}
}
