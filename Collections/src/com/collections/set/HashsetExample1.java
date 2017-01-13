package com.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample1 {

	public static void main(String[] args) {

		Set<String> hs = new HashSet<String>();
		hs.add("sai");
		hs.add("suma");
		hs.add("avaneesh");
		hs.add("sai");
		for (String print: hs){
			System.out.println(print);
		}
	}

}
