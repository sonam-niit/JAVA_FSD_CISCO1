package com.cisco.session1.functions;

public class VarArgs {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("There is No Arguments Passed");
		}else {
			for(String a:args) {
				System.out.println(a);
			}
		}
	}
}
