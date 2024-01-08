package com.cisco.session1.basic;

public class DefaultValues {
	
	static byte b;
	static long l;
	static short s; 
	static int i;
	static float f; 
	static double d;
	static char c;  //\u0000
	static boolean x; //false

	public static void main(String[] args) {
		System.out.println("Byte: "+b);
		System.out.println("Short: "+s);
		System.out.println("Int: "+i);
		System.out.println("Long: "+l);
		System.out.println("Float "+f+" Double: "+d);
		System.out.println("Char: "+c);
		System.out.println("Boolean: "+x);
	}
}
