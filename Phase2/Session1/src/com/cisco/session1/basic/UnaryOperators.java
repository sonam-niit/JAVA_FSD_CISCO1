package com.cisco.session1.basic;

public class UnaryOperators {

	public static void main(String[] args) {
		int x=10;
		System.out.println(x++);//print 10 and then x become 11
		System.out.println(++x);// change x=12 then print
		System.out.println(x--);//12 and then it become 11
		System.out.println(--x);//decrease x by 1 and then print 10
		int a=10;
		System.out.println(~a);
		int b=-10;
		System.out.println(~b);
		boolean c=true; boolean d=false;
		System.out.println(!c);
		System.out.println(!d);
	}
}
