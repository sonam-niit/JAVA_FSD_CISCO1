package com.cisco.session3.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	// No null keys and null values allowed
	//all the methods are synchronized means slower than HashMap
	public static void main(String[] args) {
		Hashtable<Integer, String> table= new Hashtable<Integer, String>();
		table.put(1, "sonam");
		table.put(6, "alex");
		table.put(3, "Devid");
		System.out.println(table);
		System.out.println(table.get(6));
		System.out.println(table.size());
		
		Enumeration<Integer> keys=table.keys();
		while(keys.hasMoreElements()) {
			int key=keys.nextElement();
			System.out.println(key+" "+table.get(key));
		}
		
	}
}
