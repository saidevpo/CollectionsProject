package com.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapRatanExample {

	public static void main(String[] args) {

		HashMap h = new HashMap();
		h.put(111, "polasai");
		h.put(112, "saipola");
		h.put(113, "saidev");
		
		System.out.println(h);
		// for only keys
		Set s = h.keySet();
		System.out.println(s);
		
		//for only values
		Collection c = h.values();
		System.out.println(c);
		//to return all the entries
		Set ss = h.entrySet();
		Iterator itr = ss.iterator();
		
		while (itr.hasNext()) {
			 Map.Entry m = (Map.Entry)itr.next();
			System.out.println(m.getKey() + "-----" + m.getValue());
		}
		
	}

}
