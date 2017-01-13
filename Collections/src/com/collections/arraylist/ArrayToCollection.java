package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToCollection {

	public static void main(String[] args) {
		String[] s = {"sai","suma","avaneesh"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
		al.add("kp");
		al.add("girija");
		
		for (String ss : al) {
			System.out.println(ss);
		}
		
		
		
		
	}

}
