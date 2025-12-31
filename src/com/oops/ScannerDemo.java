package com.oops;

import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Scanner sc1= new Scanner(System.in);
	int a;
	System.out.println("Enter Integer: ");
	a=sc.nextInt();
	System.out.println(a);
	
	float b;
	System.out.println("Enter Float number: ");
	b=sc.nextFloat();
	System.out.println(b);
	
	char ch;
	System.out.println("Enter character : ");
	ch=sc.next().charAt(0);
	System.out.println(ch);
	
	String str;
	System.out.println("Enter String: ");
	str=sc.next();
	System.out.println(str);
	
	String str2;
	System.out.println("Enter Long String: ");
	str2=sc1.nextLine();
	System.out.println(str2);
	sc.close();
	sc1.close();
}
}
