package com.cisco.session3.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> list= new LinkedList<String>();
		list.add("Android");
		list.add("IOS");
		list.add("Mac");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains("Mac"));
		list.remove("IOS");
		
		Iterator<String> itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
