package com.collections.arraylist;

import java.util.ArrayList;

public class ArraylistExample1 {

	public static void main(String[] args) {
		//Create array list
		ArrayList<String> al = new ArrayList<String>();
		//adding to array list
		al.add("sai");
		al.add("suma");
		al.add("avaneesh");
		//getting Iterator from array list to traverse elements 
		/*Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());*/
		//using for loop
		 for (String string : al) {
			System.out.println(string);
		}
		}
	}


