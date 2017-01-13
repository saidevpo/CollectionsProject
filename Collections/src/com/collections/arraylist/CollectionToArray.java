package com.collections.arraylist;

import java.util.ArrayList;

public class CollectionToArray {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {


		ArrayList<String> al = new ArrayList<String>();
		al.add("sai");
		al.add("suma");
		al.add("avaneesh");
		al.add("girija");
		
		String[] s = new String[al.size()];
		al.toArray(s);
		
		for (String string : s) {
			System.out.println(string);
		}
		
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add("suma");
		al1.add(10.1);
		al1.add(true);
		
		@SuppressWarnings("unused")
		Object oo = al.toArray();
		
		for (Object object : al1) {
			System.out.println(object);
		}
		
	}

}
