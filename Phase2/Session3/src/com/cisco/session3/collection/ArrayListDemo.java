package com.cisco.session3.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		System.out.println(list);
		System.out.println("Size: "+list.size());
		list.remove(2);
		System.out.println(list);
		//Check the List contains Object or not
		System.out.println(list.contains(20));
		//Iterate then use Iterator
		Iterator<Integer> itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
