package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortCollections {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sai");
		al.add("suma");
		al.add("avaneesh");
		al.add("girija");
		for (String string : al) {
			System.out.println("Before sorting " + string);
		}
		Collections.sort(al);
		System.out.println("After sorting " + al);
	}

}
