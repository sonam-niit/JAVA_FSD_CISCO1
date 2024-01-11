package com.cisco.session3.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {

	//accept one null key and many null values
		public static void main(String[] args) {
			TreeMap<Integer, String> map= new TreeMap<Integer, String>();
			map.put(1, "sonam");
			map.put(6, "alex");
			map.put(3, "Devid");
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
