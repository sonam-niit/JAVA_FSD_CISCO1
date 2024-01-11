package com.cisco.session3.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	//accept one null key and many null values
	public static void main(String[] args) {
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "sonam");
		map.put(6, "alex");
		map.put(3, "Devid");
		map.put(null, null);
		map.put(null, "Sonam");
		map.put(9, null);
		System.out.println(map);
		System.out.println(map.get(6));
		System.out.println(map.size());
		Set<Entry<Integer,String>> entries =map.entrySet();
		for(Map.Entry<Integer, String> entry:entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
