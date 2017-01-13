package com.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetExample {
//maintains insertion order
	public static void main(String[] args) {

		Set<String> lhs = new LinkedHashSet<String>();
		lhs.add("sai");
		lhs.add("sai1");
		lhs.add("sai");
		
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
