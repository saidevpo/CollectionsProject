package com.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(101, "saidev");
		lhm.put(104, "saidev4");
		lhm.put(102, "saidev2");
		lhm.put(105, "saidev5");
		lhm.put(101, "saidev");
		
		for(Map.Entry<Integer, String> m: lhm.entrySet()){
			
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
