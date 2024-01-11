package com.cisco.session3.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSetDemo {

	public static void main(String[] args) {
		// No Duplicates Allowed
		// insertion order maintained //Slow then HashSet
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(90);
		set.add(70);
		System.out.println(set);
		System.out.println("Size: " + set.size());
		set.remove(70);
		System.out.println(set);
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
