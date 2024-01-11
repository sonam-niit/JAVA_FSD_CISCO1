package com.cisco.session3.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		//No Duplicates Allowed
		//No insertion order maintained //Fast
		HashSet<Integer> set= new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(90);
		set.add(70);
		System.out.println(set);
		System.out.println("Size: "+set.size());
		set.remove(70);
		System.out.println(set);
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}
}
