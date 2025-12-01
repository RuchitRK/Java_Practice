package com.constructor;

class Employee123{
	int id;
	String name;
	public void setData() {
		id=25;
		name="Ruchit";
	}
}
class Incentives123 extends Employee123{
	double overtime=6787;
}
class PF extends Incentives123{
	double pf_balance=788009.990;
	public void show() {
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("Overtime is: "+overtime);
		System.out.println("PF Balance is: "+pf_balance);
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		PF in=new PF();
		in.setData();
		in.show();
	}

}
