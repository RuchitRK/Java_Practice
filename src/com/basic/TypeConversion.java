package com.basic;

/* Sizes of different data types [Primitive]
 * int  	= 4 bytes
 * long 	= 8 bytes
 * boolean 	= 1 bit
 * float 	= 4 bytes
 * double 	= 8 bytes
 * char		= 2 bytes
 * byte		= 1 byte
 */

public class TypeConversion {
	public static void main(String[] args) {
		float f1 = 56.1111f;
		double d1 = f1;
		System.out.println("Implicit coversion of float to double : "+d1);
		
		int i1 = 129;
		byte b1 = (byte)i1; // byte only supports -128 to 127 so it will cycle through it
		System.out.println("Explicit conversion of integer to byte is: " +b1);
	}

}
