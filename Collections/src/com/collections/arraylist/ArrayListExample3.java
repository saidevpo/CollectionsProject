package com.collections.arraylist;

import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("sai");
		al.add("suma");
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("avaneesh");
		al.addAll(al1);
		for(String print : al){
			System.out.println(print);
		}
		
		
	}

}
