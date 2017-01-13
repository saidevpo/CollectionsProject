package com.collections.linkedlist;

import java.util.LinkedList;

public class LinkedlistExample {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("sai");
		ll.add("suma");ll.add("avan");
		
		for(String print: ll){
			System.out.println(print);
		}

	}

}
