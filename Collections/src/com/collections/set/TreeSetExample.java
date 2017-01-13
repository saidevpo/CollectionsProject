package com.collections.set;

import java.util.TreeSet;

public class TreeSetExample {
//sorts by ascending order
	public static void main(String[] args) {
	
		TreeSet<String> Ts = new TreeSet<>();
		Ts.add("saidev");
		Ts.add("polav");
		Ts.add("suma");
		Ts.add("avaneesh");
		Ts.add("saidev");
		Ts.add("krishna");
		
		for(String p: Ts){
			System.out.println(p);
		}
	}

}
