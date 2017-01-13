package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	//Entry is the subinterface of Map. So we will be accessed it by Map.Entry name. It provides methods to get key and value.
	//The entrySet() method is used to get a Set view of the mappings contained in this map.
	//It maintains no order.
	


	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(103, "saip");
		hm.put(100, "sai");
		hm.put(102, "said");
		hm.put(101, "saide");
		hm.put(100, "saidev");
		
		for(Map.Entry<Integer, String> m:hm.entrySet()){
			System.out.println(m.getKey()+ " " + m.getValue());
			
		}

	}

}
